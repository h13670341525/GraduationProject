package com.dhu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 黄朝胜
 * @Title: StringReg
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3120:56
 */
public class StringReg {
    private static final String emailReg = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private static final String passwordReg = "^[a-zA-Z0-9]{6,15}$";

    public static boolean isEmail(String email){
          return  Pattern.matches(emailReg, email);
    }

    public static boolean isPassword(String password){
        return  Pattern.matches(passwordReg , password);
    }
}
