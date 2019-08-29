package com.vip.imi.mapper;

import com.vip.imi.domain.vo.OrderDetailVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author QiongXuan_Lin
 * @date 2019/8/29 0:28
 */
public interface OrderDetailMapper {

    /**
     * 增加订单详情
     * @param orderId
     * @param productcarIds
     * @return
     */
    int insert(@Param("orderId") Integer orderId,
               @Param("productcarIds") List<Integer> productcarIds);

    /**
     * 根据orderId查询订单商品详情
     * @param orderId
     * @return
     */
    List<OrderDetailVo> selectByOrderId(@Param("orderId") Integer orderId);

}