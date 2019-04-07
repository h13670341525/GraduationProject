package com.dhu.domain;

public class Goodstype {
    private String goodstypeid;

    private String goodstypename;

    private String goodsbigtypeid;

    public String getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(String goodstypeid) {
        this.goodstypeid = goodstypeid == null ? null : goodstypeid.trim();
    }

    public String getGoodstypename() {
        return goodstypename;
    }

    public void setGoodstypename(String goodstypename) {
        this.goodstypename = goodstypename == null ? null : goodstypename.trim();
    }

    public String getGoodsbigtypeid() {
        return goodsbigtypeid;
    }

    public void setGoodsbigtypeid(String goodsbigtypeid) {
        this.goodsbigtypeid = goodsbigtypeid == null ? null : goodsbigtypeid.trim();
    }
}