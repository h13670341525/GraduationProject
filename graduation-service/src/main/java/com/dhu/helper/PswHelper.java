package com.dhu.helper;

/**
 * @author 黄朝胜
 * @Title: PswHelper
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3120:06
 */
public class PswHelper {
    public static String generatePsw(){
        String password=(int)((Math.random()*9+1)*100000)+"";
        return password;
    }
}
