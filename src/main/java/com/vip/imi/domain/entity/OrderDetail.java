package com.vip.imi.domain.entity;

import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/29 0:28
 */
@Data
public class OrderDetail {
    /**
    * 订单详情表id【相当于属性值id】
    */
    private Integer orderDetailId;

    /**
    * 订单id【相当于属性id】
    */
    private Integer orderId;

    /**
    * 购物车id【相当于属性值】
    */
    private Integer productcarId;

    /**
    * 状态：1正常  0删除【默认1】
    */
    private Integer orderDetailStatus;
}