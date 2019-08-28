package com.vip.imi.mapper;

import com.vip.imi.domain.entity.UserLogin;

import org.apache.ibatis.annotations.Param;

public interface UserLoginMapper {
    UserLogin selectUserById(@Param("id") long id);
    UserLogin addUser(@Param("useruserLogin") UserLogin userLogin);
}