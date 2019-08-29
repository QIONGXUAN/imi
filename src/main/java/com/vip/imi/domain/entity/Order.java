package com.vip.imi.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/28 17:59
 */
@Data
public class Order {
    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 实际支付价格
    */
    private BigDecimal orderPrice;

    /**
    * 支付状态：1支付  0未支付【默认0】
    */
    private Integer orderIsPay;

    /**
    * 支付时间
    */
    private Date orderPayTime;

    /**
    * 发货状态：1已发货  0未发货【默认0】
    */
    private Integer orderIsShip;

    /**
    * 发货时间
    */
    private Date orderShipTime;

    /**
    * 收货状态：1已收货  0为未收货【默认0】
    */
    private Integer orderIsReceipt;

    /**
    * 收货时间
    */
    private Date orderReceiptTime;

    /**
    * 订单状态：1正常  0删除【默认1】
    */
    private Integer orderStatus;

    /**
    * 订单号【未实现】
    */
    private String orderNumber;
}