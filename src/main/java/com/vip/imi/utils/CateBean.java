package com.vip.imi.utils;

import com.vip.imi.domain.vo.TCategoryVo;
import com.vip.imi.domain.vo.TNavigationVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CateBean implements Serializable {
    List<TNavigationVo> tNavigationVos;
    List<TCategoryVo> tCategoryVos;
}
