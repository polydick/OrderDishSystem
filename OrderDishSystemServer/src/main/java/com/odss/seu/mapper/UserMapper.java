package com.odss.seu.mapper;

import com.odss.seu.vo.User;
import com.odss.seu.vo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_user
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByPrimaryKey(User record);
}