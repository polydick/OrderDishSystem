package com.odss.seu.vo;

import java.io.Serializable;

public class DishType implements Serializable {
    private static final long serialVersionUID =1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ods_dishtype.ID
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ods_dishtype.Name
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ods_dishtype.ID
     *
     * @return the value of ods_dishtype.ID
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ods_dishtype.ID
     *
     * @param id the value for ods_dishtype.ID
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ods_dishtype.Name
     *
     * @return the value of ods_dishtype.Name
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ods_dishtype.Name
     *
     * @param name the value for ods_dishtype.Name
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }
}