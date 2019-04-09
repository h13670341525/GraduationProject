package com.dhu.service;

import com.dhu.domain.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List fetchHomeInfo();
    Goods fetchGoods(String goodsId);
}
