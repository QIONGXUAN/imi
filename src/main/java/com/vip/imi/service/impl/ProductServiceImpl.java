package com.vip.imi.service.impl;

import com.vip.imi.domain.entity.Product;
import com.vip.imi.mapper.ProductMapper;
import com.vip.imi.service.ProductService;
import com.vip.imi.utils.DetailBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/26 20:34
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    ProductMapper productMapper;

    @Override
    public DetailBean productDetail(int productId) {
        DetailBean detailBean = new DetailBean();
        Product product = productMapper.selectByProductId(productId);
        detailBean.setProduct(product);
        return detailBean;
    }
}
