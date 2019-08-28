package com.vip.imi.controller;


import com.vip.imi.service.TuserInfService;
import com.vip.imi.service.UserLoginService;
import com.vip.imi.utils.Bean;
import com.vip.imi.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class TUserInfController {
    @Resource
    TuserInfService tuserInfService;
    @GetMapping(value ="/userInf",params = "id")
    public Result getUserInf(long id) {
        try {
            Bean bean = tuserInfService.selectByPrimaryKey(id);
            return Result.success(bean);
        } catch (Exception ex) {
            return Result.error();
        }
    }
}
