package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.TNavigationMenu;
import com.vip.imi.domain.entity.TProduct;
import lombok.Data;

import java.util.List;

@Data
public class TNavigationMenuVo extends TNavigationMenu {
    List<TProduct> tProductList;
}