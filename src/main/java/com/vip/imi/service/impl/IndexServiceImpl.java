package com.vip.imi.service.impl;


import com.vip.imi.domain.entity.TNavigationMenu;
import com.vip.imi.domain.vo.TCategoryVo;
import com.vip.imi.domain.vo.TNavigationVo;
import com.vip.imi.domain.vo.TProductVo;
import com.vip.imi.mapper.TCategoryMapper;
import com.vip.imi.mapper.TNavigationMapper;
import com.vip.imi.mapper.TNavigationMenuMapper;
import com.vip.imi.mapper.TProductMapper;
import com.vip.imi.service.IndexService;
import com.vip.imi.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    TNavigationMapper   tNavigationMapper;
    @Resource
    TCategoryMapper tCategoryMapper;
    @Resource
    TProductMapper tProductMapper;
    @Override
    public CateBean getTNavigationVo() {
        CateBean bean = new CateBean();
        List<TNavigationVo> tNavigationVos = tNavigationMapper.findAll();
        List<TCategoryVo> findshops = tCategoryMapper.findshops();
        List<TProductVo> tProductVos = tProductMapper.AllTProduct();
        bean.setTNavigationVos(tNavigationVos);
        bean.setTCategoryVos(findshops);
        bean.setTProductVos(tProductVos);
        return bean;
    }
}
