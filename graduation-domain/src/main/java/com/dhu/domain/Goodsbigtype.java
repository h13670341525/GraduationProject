package com.dhu.domain;

public class Goodsbigtype {
    private String goodstypeid;

    private String goodstypename;

    private String goodstypeimage;

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

    public String getGoodstypeimage() {
        return goodstypeimage;
    }

    public void setGoodstypeimage(String goodstypeimage) {
        this.goodstypeimage = goodstypeimage == null ? null : goodstypeimage.trim();
    }
}