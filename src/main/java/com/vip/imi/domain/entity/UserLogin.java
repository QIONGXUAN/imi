package com.vip.imi.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserLogin {
    /**
    * 用户账号ID
    */
    private Integer userId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 注册时间
    */
    private Date userCreateDate;

    /**
    * 状态码：1为正常  0为未激活【默认1】
    */
    private Integer userLoginStatus;

    /**
    * 用户身份：1为正常用户  0为管理员【默认1】
    */
    private Integer userIdentity;

    /**
    * 是否删除：1是  0否【默认0】
    */
    private Integer userIsDelete;
}