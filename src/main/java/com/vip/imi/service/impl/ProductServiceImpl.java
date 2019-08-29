package com.vip.imi.service.impl;

import com.vip.imi.domain.entity.Product;
import com.vip.imi.domain.entity.ProductImage;
import com.vip.imi.domain.entity.ProductProperty;
import com.vip.imi.mapper.ProductImageMapper;
import com.vip.imi.mapper.ProductMapper;
import com.vip.imi.mapper.ProductPropertyMapper;
import com.vip.imi.service.ProductService;
import com.vip.imi.utils.DetailBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/26 20:34
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    ProductMapper productMapper;
    @Resource
    ProductImageMapper productImageMapper;
    @Resource
    ProductPropertyMapper productPropertyMapper;


    @Override
    public DetailBean productBuy(int productId) {
        DetailBean detailBean = new DetailBean();
        Product product = productMapper.selectByProductId(productId);
        List<ProductImage> productImages = productImageMapper.selectByProductId(productId);
        List<ProductProperty> productProperties = productPropertyMapper.selectByProductId(productId);
        detailBean.setProduct(product);
        detailBean.setProductImages(productImages);
        detailBean.setProductProperties(productProperties);
        return detailBean;
    }

}
