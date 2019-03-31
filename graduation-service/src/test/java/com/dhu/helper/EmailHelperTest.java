package com.dhu.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailHelperTest {

    @Test
    public void sendMail() {
        System.out.println(EmailHelper.sendMail("825829416@qq.com",1,"123456"));
    }
}