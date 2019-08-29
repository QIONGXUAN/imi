package com.vip.imi.service;

import com.vip.imi.utils.CartBean;

import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/28 0:03
 */
public interface ProductcarService {

    /**
     * 加入购物车
     * @param userId
     * @param productId
     * @param productcarNum 加入购物车的商品数量
     * @return
     */
    public int insertProductcar(int userId, int productId, int productcarNum);

    /**
     * 购物车商品显示
     * @param userId
     * @return
     */
    public CartBean showProductcar(Integer userId, List<Integer> productPropertyValueIds);

}
