package com.dhu.domain;

public class Goodsbigtype {
    private String goodstypeid;

    private String goodstypename;

    private String goodsdescription;

    private String goodstypeimage;

    private String goodstypebackimage;

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

    public String getGoodsdescription() {
        return goodsdescription;
    }

    public void setGoodsdescription(String goodsdescription) {
        this.goodsdescription = goodsdescription == null ? null : goodsdescription.trim();
    }

    public String getGoodstypeimage() {
        return goodstypeimage;
    }

    public void setGoodstypeimage(String goodstypeimage) {
        this.goodstypeimage = goodstypeimage == null ? null : goodstypeimage.trim();
    }

    public String getGoodstypebackimage() {
        return goodstypebackimage;
    }

    public void setGoodstypebackimage(String goodstypebackimage) {
        this.goodstypebackimage = goodstypebackimage == null ? null : goodstypebackimage.trim();
    }
}