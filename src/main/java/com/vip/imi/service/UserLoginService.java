package com.vip.imi.service;


import com.vip.imi.domain.entity.UserLogin;
import com.vip.imi.utils.Bean;

public interface UserLoginService {
    Bean selectByPrimaryKey(long userId);
    Bean addUser(UserLogin user);
}
