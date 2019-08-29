package com.vip.imi.domain.vo;

import com.vip.imi.domain.entity.OrderDetail;
import com.vip.imi.domain.entity.Productcar;
import lombok.Data;

import java.util.List;

/**
 * @author QiongXuan_Lin
 * @date 2019/8/29 0:57
 */
@Data
public class OrderDetailVo extends OrderDetail {

    List<Productcar> productcars;

}
