package com.dhu.helper;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

public class MD5Helper {
    public static String EncoderByMd5(String str){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
            return newstr;
        }catch (Exception e){
            return null;
        }
    }
}
