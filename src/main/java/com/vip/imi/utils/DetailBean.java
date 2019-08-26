package com.vip.imi.utils;

import com.vip.imi.domain.entity.Product;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author QiongXuan_Lin
 * @date 2019/8/25 21:21
 */
@Data
public class DetailBean implements Serializable {

    Product product;

}
