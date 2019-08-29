package com.vip.imi.mapper;

import com.vip.imi.domain.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/28 17:59
 */
public interface OrderMapper {

    /**
     * 添加订单 返回主键orderId
     * @param order
     * @return
     */
    int insert(@Param("order") Order order);

    /**
     * 根据orderId查询订单
     * @param orderId
     * @return
     */
    Order selectByOrderId(@Param("orderId") Integer orderId);

}