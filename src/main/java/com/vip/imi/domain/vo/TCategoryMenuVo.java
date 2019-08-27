package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.TCategory;
import com.vip.imi.domain.entity.TProduct;
import lombok.Data;

import java.util.List;

@Data
public class TCategoryMenuVo extends TCategory {
    List<TProduct> tProductList;
}
