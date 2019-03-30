package com.dhu.dao;

import com.dhu.domain.User;

import java.util.List;

public interface UserDao {
    void insertUser(User user);
    User findUser(int userId);
}
