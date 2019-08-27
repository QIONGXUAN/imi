package com.vip.imi.domain.entity;

import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 11:11
 */
@Data
public class ProductPropertyValue {
    /**
    * 商品属性值id
    */
    private Integer productPropertyValueId;

    /**
    * 商品属性id
    */
    private Integer productPropertyId;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 商品属性值
    */
    private String productPropertyValue;

    /**
    * 是否删除：1是  0否【默认0】
    */
    private Integer productPropertyValueIsDelete;
}