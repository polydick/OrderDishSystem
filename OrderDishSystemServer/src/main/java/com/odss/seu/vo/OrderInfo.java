package com.odss.seu.vo;

import com.fasterxml.jackson.annotation.JsonView;

import java.io.Serializable;

public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ods_orderinfo.ID
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    @JsonView(ViewLevel.Summary.class)
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ods_orderinfo.Order
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    @JsonView(ViewLevel.Summary.class)
    private Order order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ods_orderinfo.Dish
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    @JsonView(ViewLevel.Summary.class)
    private Dish dish;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ods_orderinfo.DishState
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    @JsonView(ViewLevel.Summary.class)
    private Integer dishstate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ods_orderinfo.ID
     *
     * @return the value of ods_orderinfo.ID
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ods_orderinfo.ID
     *
     * @param id the value for ods_orderinfo.ID
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ods_orderinfo.Order
     *
     * @return the value of ods_orderinfo.Order
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public Order getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ods_orderinfo.Order
     *
     * @param order the value for ods_orderinfo.Order
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ods_orderinfo.Dish
     *
     * @return the value of ods_orderinfo.Dish
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public Dish getDish() {
        return dish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ods_orderinfo.Dish
     *
     * @param dish the value for ods_orderinfo.Dish
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ods_orderinfo.DishState
     *
     * @return the value of ods_orderinfo.DishState
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public Integer getDishstate() {
        return dishstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ods_orderinfo.DishState
     *
     * @param dishstate the value for ods_orderinfo.DishState
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public void setDishstate(Integer dishstate) {
        this.dishstate = dishstate;
    }
}