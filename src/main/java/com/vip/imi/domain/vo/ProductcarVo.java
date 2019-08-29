package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.Product;
import com.vip.imi.domain.entity.Productcar;
import lombok.Data;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/28 15:36
 */
@Data
public class ProductcarVo extends Productcar {

    Product product;

}
