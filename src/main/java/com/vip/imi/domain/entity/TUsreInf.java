package com.vip.imi.domain.entity;

import lombok.Data;

@Data
public class TUsreInf {
    /**
     * 用户信息id
     */
    private Integer userInfId;

    /**
     * 用户账号id
     */
    private Integer userId;

    /**
     * 用户真实名称
     */
    private String userInfName;

    /**
     * 用户性别
     */
    private String userInfSex;

    /**
     * 用户邮箱
     */
    private String userInfEmail;

    /**
     * 用户手机
     */
    private String userInfPhone;

    /**
     * 用户信息状态：1为正常  0为不可用【默认1】
     */
    private Integer userInfStatus;
}