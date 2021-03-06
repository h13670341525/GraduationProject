package com.dhu.service.impl;

import com.auth0.jwt.JWT;
import com.dhu.dao.UserMapper;
import com.dhu.domain.User;
import com.dhu.helper.JwtHelper;
import com.dhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 黄朝胜
 * @Title: UserServiceImpl
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3019:43
 */


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user) {
    }

    public User info(String token) {
        String userid = JwtHelper.getUserid(token);
        return userMapper.selectByPrimaryKey(userid);
    }
}
