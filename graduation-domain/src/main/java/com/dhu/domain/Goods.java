package com.dhu.domain;

import java.util.Date;

public class Goods {
    private String goodsid;

    private String goodsname;

    private String salerid;

    private Double goodsprice;

    private String goodstypeid;

    private Date producedate;

    private Integer qualityperiod;

    private String goodsimage;

    private String goodsdescription;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getSalerid() {
        return salerid;
    }

    public void setSalerid(String salerid) {
        this.salerid = salerid == null ? null : salerid.trim();
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(String goodstypeid) {
        this.goodstypeid = goodstypeid == null ? null : goodstypeid.trim();
    }

    public Date getProducedate() {
        return producedate;
    }

    public void setProducedate(Date producedate) {
        this.producedate = producedate;
    }

    public Integer getQualityperiod() {
        return qualityperiod;
    }

    public void setQualityperiod(Integer qualityperiod) {
        this.qualityperiod = qualityperiod;
    }

    public String getGoodsimage() {
        return goodsimage;
    }

    public void setGoodsimage(String goodsimage) {
        this.goodsimage = goodsimage == null ? null : goodsimage.trim();
    }

    public String getGoodsdescription() {
        return goodsdescription;
    }

    public void setGoodsdescription(String goodsdescription) {
        this.goodsdescription = goodsdescription == null ? null : goodsdescription.trim();
    }
}