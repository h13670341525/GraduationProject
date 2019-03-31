package com.dhu.service.impl;

import com.dhu.service.LoginService;
import com.dhu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-*.xml"})
public class LoginServiceImplTest {


    @Autowired
    private LoginService loginService;

    @Test
    public void loginSuccess() {
        Map<String, Object> map = loginService.login("825829417@qq.com", "hzq123789");
        System.out.println(map);
    }

    @Test
    public void registerSuccess() {
        System.out.println(loginService.register("825829417@qq.com","hzq123789"));
    }

    @Test
    public void registerFail(){
        System.out.println(loginService.register("825829416@qq.com","hzq123789"));
    }

    @Test
    public void reminderSuccess() {
        System.out.println(loginService.reminder("825829416@qq.com"));
    }
}