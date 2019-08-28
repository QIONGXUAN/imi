package com.vip.imi.service.impl;

import com.vip.imi.domain.entity.TUsreInf;
import com.vip.imi.domain.vo.TUserInfVo;
import com.vip.imi.mapper.TUserInfMapper;
import com.vip.imi.service.TuserInfService;
import com.vip.imi.utils.Bean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TUserInfServiceImpl implements TuserInfService {
   @Resource
   TUserInfMapper tUsreInfMapper;


    @Override
    public Bean selectByPrimaryKey(@Param("userId") long userId) {
        TUserInfVo tUserInfVo = tUsreInfMapper.selectByPrimaryKey(userId);
        Bean bean=new Bean();
        bean.setTUserInfVo(tUserInfVo);
        return bean;
    }
}
