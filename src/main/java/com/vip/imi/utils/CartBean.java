package com.vip.imi.utils;

import com.vip.imi.domain.entity.ProductPropertyValue;
import com.vip.imi.domain.entity.Productcar;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 购物车
 * @author QiongXuan_Lin
 * @date 2019/8/28 13:03
 */
@Data
public class CartBean implements Serializable {

    List<Productcar> productcars;
    List<ProductPropertyValue> productPropertyValues;
}
