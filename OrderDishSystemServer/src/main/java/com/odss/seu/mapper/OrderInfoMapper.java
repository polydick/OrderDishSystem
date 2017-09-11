package com.odss.seu.mapper;

import com.odss.seu.vo.Order;
import com.odss.seu.vo.OrderInfo;
import com.odss.seu.vo.OrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    long countByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int deleteByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    int deleteByOrder(Order order);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int insert(OrderInfo record);

    int insertOrderDishes(Order order);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int insertSelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    List<OrderInfo> selectByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    OrderInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ods_orderinfo
     *
     * @mbg.generated Fri Sep 08 14:07:18 CST 2017
     */
    int updateByPrimaryKey(OrderInfo record);
}