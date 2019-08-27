package com.vip.imi.service.impl;

import com.vip.imi.mapper.ProductcarMapper;
import com.vip.imi.service.ProductcarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/28 0:05
 */
@Service
public class ProductcarServiceImpl implements ProductcarService {

    @Resource
    ProductcarMapper productcarMapper;

    @Override
    public int insertProductcar(int userId, int productId, int productcarNum) {
        return productcarMapper.insert(userId, productId, productcarNum);
    }
}
