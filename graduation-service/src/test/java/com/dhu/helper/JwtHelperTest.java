package com.dhu.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class JwtHelperTest {

    @Test
    public void sign() {
        String userid = "cherish";
        int usertype = 1;
        String sign = JwtHelper.sign(userid, usertype);
        System.out.println(sign);
    }

    @Test
    public void verify() {
        System.out.println(JwtHelper.verify("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VydHlwZSI6MSwiZXhwIjoxNTU0MDMwNzU0LCJ1c2VyaWQiOiJjaGVyaXNoIn0.pOqZyFvGBJxgfIbtiKAnyTRKxuILiISSdndTuGrmhLo"));
    }

    @Test
    public void getUserid() {
        System.out.println(JwtHelper.getUserid("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VydHlwZSI6MSwiZXhwIjoxNTU0MDMwNzU0LCJ1c2VyaWQiOiJjaGVyaXNoIn0.pOqZyFvGBJxgfIbtiKAnyTRKxuILiISSdndTuGrmhLo"));
    }

    @Test
    public void getUsertype() {
        System.out.println(JwtHelper.getUsertype("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VydHlwZSI6MSwiZXhwIjoxNTU0MDMwNzU0LCJ1c2VyaWQiOiJjaGVyaXNoIn0.pOqZyFvGBJxgfIbtiKAnyTRKxuILiISSdndTuGrmhLo"));
    }
}