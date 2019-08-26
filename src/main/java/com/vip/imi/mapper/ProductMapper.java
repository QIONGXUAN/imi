package com.vip.imi.mapper;

import com.vip.imi.domain.entity.Product;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/26 18:37
 */
public interface ProductMapper {

    Product selectByProductId(Integer productId);

}