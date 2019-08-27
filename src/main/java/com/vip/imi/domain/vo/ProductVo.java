package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.Product;
import com.vip.imi.domain.entity.ProductStock;
import lombok.Data;

import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/26 20:21
 */
@Data
public class ProductVo extends Product {

    List<ProductStock> productStocks;

}
