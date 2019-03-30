package com.dhu.controller;

import com.dhu.dao.UserDao;
import com.dhu.domain.User;
import com.dhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 黄朝胜
 * @Title: LoginController
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/2910:01
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login.do")
    public String login(){
        User user = new User();
        user.setUserName("Cherish");
        userService.insertUser(user);
        return "hello world";
    }
}
