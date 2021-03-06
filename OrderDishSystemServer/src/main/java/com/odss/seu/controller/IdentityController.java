package com.odss.seu.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.odss.seu.service.LoginService;
import com.odss.seu.service.exception.CaptchaWrongException;
import com.odss.seu.vo.User;
import com.odss.seu.vo.ViewLevel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;


@RestController
@RequestMapping(value = "/identity")
public class IdentityController {

    public static Logger lo = Logger.getLogger(IdentityController.class);

    private LoginService loginService;
    private Producer producer;

    @Autowired
    public IdentityController(LoginService loginService, Producer producer) {
        this.loginService = loginService;
        this.producer = producer;
    }

    @RequestMapping(method = RequestMethod.POST)
    @JsonView(ViewLevel.Summary.class)
    public User login(@RequestParam(value = "username") String username,
                      @RequestParam(value = "password") String password,
                      @RequestParam(value = "captcha") String captcha,
                      HttpServletRequest request) {
        User user = loginService.login(username, password);//返回登陆结果
        HttpSession session = request.getSession();
        session.setAttribute("user", user.getType());//设置用户的身份
        Object useridentity = session.getAttribute("user");
        Object captchaInSession = session.getAttribute(Constants.KAPTCHA_SESSION_CONFIG_KEY);
        if (captchaInSession == null || !captchaInSession.toString().equals(captcha))
            throw new CaptchaWrongException();
        Integer userIdentity = Integer.parseInt(useridentity == null ? "" : useridentity.toString());
        if (userIdentity.equals(UserType.WAITER.ordinal()))//假设waiter是2
        {
            session.setAttribute("busy", Boolean.FALSE);//设置当前状态为空闲，可以上菜
        }
        return user;
    }


    @RequestMapping(method = RequestMethod.DELETE)
    @JsonView(ViewLevel.Summary.class)
    public void logout(HttpSession session) {
        Object useridentity = session.getAttribute("user");
        Integer userIdentity = Integer.parseInt(useridentity == null ? "" : useridentity.toString());

        if (userIdentity.equals(2)) {
            session.removeAttribute("busy");
        }
        session.removeAttribute("user");
        session.invalidate();
    }

    @RequestMapping(value = "/captcha", method = RequestMethod.GET)
    public @ResponseBody
    void captcha(HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        String capText = this.producer.createText();
        BufferedImage bi = this.producer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        try {
            HttpSession session = request.getSession();
            session.setAttribute(Constants.KAPTCHA_SESSION_CONFIG_KEY, capText);//在该用户的session中记录他的验证码值
        } catch (Exception e) {
            e.printStackTrace();
        }
        ImageIO.write(bi, "jpeg", out);
    }
}
