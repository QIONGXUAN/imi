package com.vip.imi.utils;

import com.vip.imi.domain.entity.Product;
import com.vip.imi.domain.entity.ProductImage;
import com.vip.imi.domain.entity.ProductProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品详情
 * @author QiongXuan_Lin
 * @date 2019/8/25 21:21
 */
@Data
public class DetailBean implements Serializable {

    Product product;
    List<ProductImage> productImages;
    List<ProductProperty> productProperties;

}
