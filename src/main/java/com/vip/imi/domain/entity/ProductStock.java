package com.vip.imi.domain.entity;

import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/26 18:38
 */
@Data
public class ProductStock {
    /**
    * 商品库存id
    */
    private Integer productStockId;

    /**
    * 商品 ID
    */
    private Integer productId;

    /**
    * 商品产地
    */
    private String productStockPlace;

    /**
    * 商品库存数量
    */
    private Integer productStockNum;

    /**
    * 是否删除：1是  0否【默认0】
    */
    private Integer productStockIsDelete;
}