package com.dhu.domain;

public class Shopcart {
    private String shopcartid;

    private String goodsid;

    private String userid;

    private Integer goodsnum;

    public String getShopcartid() {
        return shopcartid;
    }

    public void setShopcartid(String shopcartid) {
        this.shopcartid = shopcartid == null ? null : shopcartid.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }
}