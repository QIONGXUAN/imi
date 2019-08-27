package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.ProductProperty;
import com.vip.imi.domain.entity.ProductPropertyValue;
import lombok.Data;

import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/27 13:35
 */
@Data
public class ProductPropertyVo extends ProductProperty {
    List<ProductPropertyValue> productPropertyValues;
}
