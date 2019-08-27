package com.vip.imi.controller;

import com.vip.imi.service.ProductcarService;
import com.vip.imi.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/28 0:11
 */
@RestController
@RequestMapping("/productcar")
public class ProductcarController {

    @Resource
    ProductcarService productcarService;

    @RequestMapping("/insert")
    public Result insertProductcar(int userId, int productId, int productcarNum) {
        int i = productcarService.insertProductcar(userId, productId, productcarNum);
        if (i>0) {
            return Result.success();
        }else{
            return Result.error();
        }
    }

}
