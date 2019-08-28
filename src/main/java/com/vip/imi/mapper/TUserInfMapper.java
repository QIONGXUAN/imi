package com.vip.imi.mapper;

import com.vip.imi.domain.entity.TUsreInf;
import com.vip.imi.domain.vo.TUserInfVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserInfMapper {


    TUserInfVo selectByPrimaryKey(@Param("userId") long userId);


}