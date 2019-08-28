package com.vip.imi.mapper;

import com.vip.imi.domain.vo.TUserInfVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml",
        "classpath:spring-mybatis.xml"
})
@Slf4j
public class TUserInfMapperTest {
@Resource
TUserInfMapper tUserInfMapper;

    @Test
    public void selectByPrimaryKey() {
        TUserInfVo tUserInfVo = tUserInfMapper.selectByPrimaryKey(1);
//        log.error(tUserInfVo);
        System.out.println(tUserInfVo);
    }
}