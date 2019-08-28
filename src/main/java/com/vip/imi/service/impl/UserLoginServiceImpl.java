package com.vip.imi.service.impl;

import com.vip.imi.domain.entity.UserLogin;

import com.vip.imi.mapper.UserLoginMapper;
import com.vip.imi.service.UserLoginService;
import com.vip.imi.utils.Bean;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
@Service
public class UserLoginServiceImpl implements UserLoginService {
   @Resource
   UserLoginMapper userLoginMapper;




    @Override
    public Bean selectByPrimaryKey(long userId) {
        UserLogin userLogin = userLoginMapper.selectUserById(userId);
        Bean bean=new Bean();
        bean.setUserLogin(userLogin);
        return bean;
    }

    @Override
    public Bean addUser(UserLogin user) {
      UserLogin userLogin = userLoginMapper.addUser(user);
        Bean bean=new Bean();
        bean.setUserLogin(userLogin);
       return bean;
    }
}
