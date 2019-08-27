package com.vip.imi.service;

import com.vip.imi.utils.DetailBean;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/26 20:32
 */
public interface ProductService {

    /**
     * 商品详情
     * @param productId
     * @return
     */
    public DetailBean productBuy(int productId);
}
