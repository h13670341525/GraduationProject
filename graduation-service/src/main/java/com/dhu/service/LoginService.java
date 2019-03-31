package com.dhu.service;

import java.util.Map;

public interface LoginService {
    String LOGIN_STATUS = "loginStatus";
    String LOGIN_TOKEN = "token";
    String USER_NAME = "username";
    String USER_TYPE = "usertype";

    Map<String,Object> login(String useremail,String userpassword);
    boolean register(String useremail,String userpassword);
    boolean reminder(String useremail);
}
