package com.vip.imi.service.impl;

import com.vip.imi.domain.entity.Order;
import com.vip.imi.domain.vo.OrderDetailVo;
import com.vip.imi.mapper.OrderDetailMapper;
import com.vip.imi.mapper.OrderMapper;
import com.vip.imi.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/29 1:04
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderMapper orderMapper;
    @Resource
    OrderDetailMapper orderDetailMapper;

    @Override
    public int createOrder(Order order, List<Integer> productcarIds) {
        int insert = orderMapper.insert(order);
        if (insert > 0) {
            int inserts = orderDetailMapper.insert(order.getOrderId(), productcarIds);
            if (inserts == productcarIds.size()) {
                return inserts;
            }
        }
        return 0;
    }

    @Override
    public Order showOrder(int orderId) {
        return orderMapper.selectByOrderId(orderId);
    }

    @Override
    public List<OrderDetailVo> showOrderDetail(int orderId) {
        return orderDetailMapper.selectByOrderId(orderId);
    }
}
