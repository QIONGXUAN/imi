package com.vip.imi.domain.entity;

import lombok.Data;

@Data
public class TCategoryMenu {
    /**
    * 一级分类ID
    */
    private Integer categoryMenuId;

    /**
    * 分类ID
    */
    private Integer categoryId;

    /**
    * 一级分类名
    */
    private String categoryMenuName;

    /**
    * 一级分类属性：0产品  1分类【默认1】
    */
    private Integer categoryMenuStatus;

   }