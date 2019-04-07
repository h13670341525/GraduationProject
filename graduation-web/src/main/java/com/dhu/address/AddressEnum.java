package com.dhu.address;

public enum AddressEnum {
    ADD_ADDRESS_SUCCESS("0001","添加地址成功"),
    FETCH_ADDRESS_SUCCESS("0002","获取地址成功"),
    SERVER_ERROR("0010","服务器错误");


    private String code;
    private String msg;

    AddressEnum(String code, String msg) {
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
