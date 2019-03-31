package com.dhu.login;

public enum LoginEnum {
    LOGIN_SUCCESS("0001","登录成功"),
    REGISTER_SUCCESS("0002","注册成功"),
    REMINDER_SUCCESS("0003","找回密码成功"),
    LOGIN_FAIL("0004","用户名或者密码错误"),
    REGISTER_EMAIL_REPEAT("0005","邮箱已被注册"),
    REGISTER_EMAIL_FAIL("0006","邮箱不符合规则"),
    REGISTER_PASSWORD_FAIL("0007","密码不符合规则"),
    REMINDER_FAIL("0008","邮箱未被注册"),
    SERVER_ERROR("0009","服务器错误");

    private String code;
    private String msg;

    LoginEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
