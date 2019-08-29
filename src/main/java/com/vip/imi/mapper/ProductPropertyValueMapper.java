package com.vip.imi.mapper;

import com.vip.imi.domain.entity.ProductPropertyValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 11:11
 */
public interface ProductPropertyValueMapper {

    /**
     * 查询购物车中商品的三个特有属性【版本 颜色 套餐】 - 根据属性值三个id
     * @param productPropertyValueIds
     * @return
     */
    List<ProductPropertyValue> selectByProductPropertyValueId(@Param("ppvIds") List<Integer> productPropertyValueIds);

}