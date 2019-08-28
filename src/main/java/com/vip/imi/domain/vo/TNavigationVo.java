package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.TNavigation;
import com.vip.imi.domain.entity.TNavigationMenu;
import lombok.Data;

import java.util.List;
@Data
public class TNavigationVo extends TNavigation {
    List<TNavigationMenu> tNavigationMenuList;
}
