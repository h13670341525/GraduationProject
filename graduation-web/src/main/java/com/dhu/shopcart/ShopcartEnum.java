package com.dhu.shopcart;

public enum ShopcartEnum {
    ADD_SHOPCART_SUCESS("0001","添加购物车成功"),
    FETCH_SHOPCART_SUCESS("0002","查询购物车成功"),
    SERVER_ERROR("0010","服务器错误");
    private String code;
    private String msg;

    ShopcartEnum(String code, String msg) {
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
