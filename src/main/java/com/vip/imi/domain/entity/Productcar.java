package com.vip.imi.domain.entity;

import java.util.Date;
import lombok.Data;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 22:16
 */
@Data
public class Productcar {
    /**
    * 购物车id
    */
    private Integer productcarId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 商品数量
    */
    private Integer productcarNum;

    /**
    * 商品创建时间
    */
    private Date productcarCreateDate;

    /**
    * 状态：1为选中  0为未选【默认0】
    */
    private Integer productcarStatus;

    /**
    * 是否删除：1是  0否【默认0】
    */
    private Integer productcarIsDelete;
}