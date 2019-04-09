package com.dhu.pojo;

import com.dhu.domain.Goods;

/**
 * @author 黄朝胜
 * @Title: GoodsShopcart
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/919:23
 */
public class GoodsShopcart extends Goods {
    private String shopcartid;
    private Integer goodsnum;

    public String getShopcartid() {
        return shopcartid;
    }

    public void setShopcartid(String shopcartid) {
        this.shopcartid = shopcartid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }
}
