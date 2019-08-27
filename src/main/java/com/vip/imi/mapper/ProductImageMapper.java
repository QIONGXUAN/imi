package com.vip.imi.mapper;

import com.vip.imi.domain.entity.ProductImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 10:11
 */
public interface ProductImageMapper {

    /**
     * 商品详情的轮播图-根据商品id
     * @param productId
     * @return
     */
    List<ProductImage> selectByProductId(@Param("productId") Integer productId);

}