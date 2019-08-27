package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.TCategory;
import com.vip.imi.domain.entity.TCategoryMenu;
import lombok.Data;

import java.util.List;
@Data
public class TCategoryVo extends TCategory {
    List<TCategoryMenu> tCategoryMenuList;
}
