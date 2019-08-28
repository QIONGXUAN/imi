package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.TProduct;
import com.vip.imi.domain.entity.TProductImage;
import lombok.Data;

import java.util.List;
@Data
public class TProductVo extends TProduct {
    List<TProductImage> tProductImageList;
}
