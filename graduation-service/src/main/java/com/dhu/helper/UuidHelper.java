package com.dhu.helper;

import java.util.UUID;

/**
 * @author 黄朝胜
 * @Title: UuidHelper
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3113:27
 */
public class UuidHelper {
    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
