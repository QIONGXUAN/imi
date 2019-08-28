package com.vip.imi.mapper;

import com.vip.imi.controller.UserLoginController;
import com.vip.imi.service.UserLoginService;
import com.vip.imi.utils.Bean;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml",
        "classpath:spring-mybatis.xml"
})
@Slf4j
public class UserLoginMapperTest {

@Resource
    UserLoginService userLoginService;
@Resource
    UserLoginController userLoginController;


    @Test
    public void selectUserById() {
        Bean bean = userLoginService.selectByPrimaryKey(1);
        System.out.println(bean);
    }
@Test
public  void  setUserLogincoo(){
    Bean bean = userLoginService.selectByPrimaryKey(1);
    System.out.println(bean);
}
    @Test
    public void testAddUser() {
    }
}
