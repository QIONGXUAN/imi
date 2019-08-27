package com.vip.imi.mapper;

import com.vip.imi.domain.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/26 18:37
 */
public interface ProductMapper {

    /**
     * 商品详情-根据商品id
     * @param productId
     * @return
     */
    Product selectByProductId(@Param("productId") Integer productId);


}