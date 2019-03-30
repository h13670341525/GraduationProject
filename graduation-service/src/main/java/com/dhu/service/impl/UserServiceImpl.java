package com.dhu.service.impl;

import com.dhu.dao.UserDao;
import com.dhu.domain.User;
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
    private UserDao userDao;

    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}
