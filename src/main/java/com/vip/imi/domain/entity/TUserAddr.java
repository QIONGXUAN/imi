package com.vip.imi.domain.entity;

import lombok.Data;

@Data
public class TUserAddr {
    /**
    * 地址表主键
    */
    private Integer userAddrId;

    /**
    * 用户信息id
    */
    private Integer userInfId;

    /**
    * 收货地址
    */
    private String userAddr;

    /**
    * 收件人名称
    */
    private String userAddrName;

    /**
    * 收件人手机
    */
    private String userAddrPhone;

    /**
    * 邮政编码
    */
    private String userAddrAreaId;

    /**
    * 是否默认地址：1是  0否【默认0】
    */
    private Integer userAddrIsDefault;

    /**
    * 是否删除：1是  0否【默认0】
    */
    private Integer uesrAddrIsDelete;
}