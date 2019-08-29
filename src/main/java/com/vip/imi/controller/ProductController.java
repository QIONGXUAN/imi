package com.vip.imi.controller;

import com.vip.imi.service.ProductService;
import com.vip.imi.utils.DetailBean;
import com.vip.imi.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/26 20:40
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    ProductService productService;

    @RequestMapping("/buy")
    public Result productBuy(int productId){
        DetailBean productDetail = productService.productBuy(productId);
        return Result.success(productDetail);
    }

}
