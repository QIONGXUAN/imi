package com.vip.imi.controller;

import com.vip.imi.domain.entity.UserLogin;
import com.vip.imi.service.UserLoginService;
import com.vip.imi.utils.Bean;
import com.vip.imi.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/api/v1")
public class UserLoginController {



        @Resource
        UserLoginService userLoginService;
        @GetMapping(value ="/login",params = "id")
        public Result getHeaderData(long id) {
            try {
                Bean bean = userLoginService.selectByPrimaryKey(id);
                return Result.success(bean);
            } catch (Exception ex) {
                return Result.error();
            }
        }
    @PostMapping(value ="/resgster" ,params ="userLogin" )
    public Result setData(UserLogin userLogin){
        try {
            Bean bean = userLoginService.addUser(userLogin);
            return Result.success(bean);
        } catch (Exception ex) {
            return Result.error();
        }
    }
    }

