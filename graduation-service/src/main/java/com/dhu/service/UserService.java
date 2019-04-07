package com.dhu.service;

import com.dhu.domain.User;

/**
 * @author 黄朝胜
 * @Title: UserService
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3019:42
 */
public interface UserService {
    void insertUser(User user);
    User info(String token);
}
