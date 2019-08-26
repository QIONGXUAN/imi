package com.vip.imi.mapper;

import com.vip.imi.domain.entity.ProductStock;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/26 18:38
 */
public interface ProductStockMapper {
    int deleteByPrimaryKey(Integer productStockId);

    int insert(ProductStock record);

    int insertSelective(ProductStock record);

    ProductStock selectByPrimaryKey(Integer productStockId);

    int updateByPrimaryKeySelective(ProductStock record);

    int updateByPrimaryKey(ProductStock record);
}