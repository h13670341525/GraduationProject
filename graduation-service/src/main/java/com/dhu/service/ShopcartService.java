package com.dhu.service;

import com.dhu.domain.Shopcart;
import com.dhu.pojo.GoodsShopcart;

import java.util.List;

public interface ShopcartService {
    void addShopcart(Shopcart shopcart, String token);
    List<GoodsShopcart> fetchShopcart(String token);
}
