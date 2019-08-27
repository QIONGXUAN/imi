package com.vip.imi.mapper;

import com.vip.imi.domain.entity.Productcar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * @author QiongXuan_Lin
 * @date 2019/8/27 22:16
 */
public interface ProductcarMapper {

    /**
     * 加入购物车
     * @param userId
     * @param productId
     * @param productcarNum 加入购物车的商品数量
     * @return
     */
    int insert(@Param("userId") Integer userId,
               @Param("productId") Integer productId,
               @Param("productcarNum") Integer productcarNum);

    /**
     * 购物车商品显示
     * @param userId
     * @return
     */
    List<Productcar> selectByUserId(@Param("userId") Integer userId);

}