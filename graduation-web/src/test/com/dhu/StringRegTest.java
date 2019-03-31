package com.dhu;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRegTest {

    @Test
    public void isEmail() {
        System.out.println(StringReg.isEmail("825829416@qq.com"));
    }

    @Test
    public void isPassword() {
        System.out.println(StringReg.isPassword("123&456"));
    }
}