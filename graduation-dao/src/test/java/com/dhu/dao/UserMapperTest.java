package com.dhu.dao;

import com.dhu.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jdbc.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        User user = new User();
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(uuid.length());
        user.setUserid(uuid);
        user.setUsername("cherish");
        user.setUseraccount(0.0);
        user.setUseremail("825829416@qq.com");
        user.setUserimage("http://localhost:8080/graduation/1.jpg");
        user.setUserpassword("123789");
        user.setUserphone("15001738030");
        user.setUsertype(1);
        userMapper.insert(user);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}