package com.dhu.goods;

public enum GoodsEnum {
    FETCH_GOODS_TYPE_SUCCESS("0001","查询商品分类成功"),
    SERVER_ERROR("0002","服务器错误");
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
