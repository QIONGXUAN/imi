package com.vip.imi.utils;


import com.vip.imi.domain.entity.UserLogin;

import com.vip.imi.domain.vo.TUserInfVo;
import lombok.Data;

import java.io.Serializable;


@Data
public class Bean implements Serializable {
    UserLogin userLogin;
    TUserInfVo tUserInfVo;
}
