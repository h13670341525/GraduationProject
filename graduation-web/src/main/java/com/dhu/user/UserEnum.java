package com.dhu.user;

public enum UserEnum {
    SEARCH_INFO_SUCCESS("0001","查询用户成功"),
    USER_NOT_EXIST("0002","用户不存在"),
    SERVER_ERROR("0010","服务器错误");
    private String code;
    private String msg;

    UserEnum(String code, String msg) {
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
