package com.vip.imi.domain.entity;

import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 10:11
 */
@Data
public class ProductImage {
    /**
    * 商品图片id
    */
    private Integer productImageId;

    /**
    * 商品id
    */
    private Integer prodcutId;

    /**
    * 商品图片类型：
imi_mall首页图片  
imi_single商品图片  
imi_detail商品介绍页图片
【默认imi_single】
    */
    private String productImageType;

    /**
    * 商品图片文件名
    */
    private String productImageUrl;

    /**
    * 删除图片：1是 0否【默认0】
    */
    private Integer productImageIsDelete;
}