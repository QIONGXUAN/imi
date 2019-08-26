package com.vip.imi.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/26 18:37
 */
@Data
public class Product {
    /**
    * 商品ID
    */
    private Integer productId;

    /**
    * 一级分类ID
    */
    private Integer categoryMenuId;

    /**
    * 一级导航ID
    */
    private Integer navigationMenuId;

    /**
    * 商品名字
    */
    private String productName;

    /**
    * 商品描述
    */
    private String productDesc;

    /**
    * 产品供应商【默认小米自营】
    */
    private String productCompany;

    /**
    * 旧的商品价格
    */
    private BigDecimal productOldPrice;

    /**
    * 新的商品价格
    */
    private BigDecimal productNewPrice;

    /**
    * 创建时间
    */
    private Date productCreateDate;

    /**
    * 商品状态：1-在售 2-下架 3-删除【默认1】
    */
    private Integer productStatus;
}