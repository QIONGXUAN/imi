package com.vip.imi.service.impl;

import com.vip.imi.domain.entity.ProductPropertyValue;
import com.vip.imi.domain.entity.Productcar;
import com.vip.imi.mapper.ProductPropertyValueMapper;
import com.vip.imi.mapper.ProductcarMapper;
import com.vip.imi.service.ProductcarService;
import com.vip.imi.utils.CartBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/28 0:05
 */
@Service
public class ProductcarServiceImpl implements ProductcarService {

    @Resource
    ProductcarMapper productcarMapper;
    @Resource
    ProductPropertyValueMapper productPropertyValueMapper;


    @Override
    public int insertProductcar(int userId, int productId, int productcarNum) {
        return productcarMapper.insert(userId, productId, productcarNum);
    }

    @Override
    public CartBean showProductcar(Integer userId, List<Integer> productPropertyValueIds) {
        CartBean cartBean = new CartBean();
        //List<Productcar> productcars = productcarMapper.selectByUserId(userId);
        List<ProductPropertyValue> productPropertyValues = productPropertyValueMapper.selectByProductPropertyValueId(productPropertyValueIds);
        System.out.println(productPropertyValues.get(1).toString());
        //cartBean.setProductcars(productcars);
        cartBean.setProductPropertyValues(productPropertyValues);
        return cartBean;
    }

}
