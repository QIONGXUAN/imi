package com.vip.imi.mapper;

import com.vip.imi.domain.entity.ProductProperty;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 11:11
 */
public interface ProductPropertyMapper {

    /**
     * 商品详情的三个属性：版本 颜色 套餐 - 根据商品id
     * @param productId
     * @return
     */
    List<ProductProperty> selectByProductId(@Param("productId") Integer productId);


}