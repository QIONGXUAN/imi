package com.vip.imi.mapper;

import com.vip.imi.domain.entity.ProductPropertyValue;
import org.apache.ibatis.annotations.Param;


/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 11:11
 */
public interface ProductPropertyValueMapper {

    /**
     * 购物车中商品的三个特有属性【版本 颜色 套餐】查询 - 根据属性值三个id
     * @param productPropertyValueId
     * @return
     */
    ProductPropertyValue selectByProductPropertyValueId(@Param("ppvId") Integer productPropertyValueId);

}