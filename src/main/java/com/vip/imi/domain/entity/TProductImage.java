package com.vip.imi.domain.entity;

import lombok.Data;

@Data
public class TProductImage {
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