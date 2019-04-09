package com.dhu.goods;

public enum GoodsEnum {
    FETCH_GOODS_TYPE_SUCCESS("0001","查询商品分类成功"),
    FETCH_GOODS_SUCCESS("0002","查询商品成功"),
    FETCH_GOODS_NOT_EXIST("0003","商品不存在"),
    SERVER_ERROR("0010","服务器错误");
    private String code;
    private String msg;

    GoodsEnum(String code, String msg) {
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
