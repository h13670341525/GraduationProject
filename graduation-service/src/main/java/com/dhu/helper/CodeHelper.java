package com.dhu.helper;

/**
 * @author 黄朝胜
 * @Title: CodeHelper
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3120:06
 */
public class CodeHelper {
    public static String generateCode(){
        String password=(int)((Math.random()*9+1)*100000)+"";
        return password;
    }
}
