package com.vip.imi.service;

import com.vip.imi.domain.entity.Order;
import com.vip.imi.domain.vo.OrderDetailVo;

import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/29 1:02
 */
public interface OrderService {

    /**
     * 创建订单 包括订单商品详情
     * @param order
     * @param productcarIds
     * @return
     */
    public int createOrder(Order order, List<Integer> productcarIds);

    /**
     * 根据orderId查看订单
     * @param orderId
     * @return
     */
    public Order showOrder(int orderId);

    /**
     * 根据orderId查询订单商品详情
     * @param orderId
     * @return
     */
    public List<OrderDetailVo> showOrderDetail(int orderId);

}
