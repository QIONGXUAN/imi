package com.vip.imi.domain.entity;

import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 11:11
 */
@Data
public class ProductProperty {
    /**
    * 商品属性id
    */
    private Integer productPropertyId;

    /**
    * 商品属性名
    */
    private String productPropertyName;

    /**
    * 是否删除：1是  0否【默认0】
    */
    private Integer productPropertyIsDelete;
}