package com.vip.imi.domain.vo;
import	java.util.Date;

import com.vip.imi.domain.entity.TUserAddr;
import com.vip.imi.domain.entity.TUsreInf;
import lombok.Data;

import java.util.List;

@Data
public class TUserInfVo extends TUsreInf {
List<TUserAddr> userAddr;
}
