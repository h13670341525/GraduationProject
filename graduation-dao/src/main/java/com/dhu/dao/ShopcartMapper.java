package com.dhu.dao;

import com.dhu.domain.Shopcart;
import com.dhu.domain.ShopcartExample;
import com.dhu.pojo.GoodsShopcart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopcartMapper {
    int countByExample(ShopcartExample example);

    int deleteByExample(ShopcartExample example);

    int deleteByPrimaryKey(String shopcartid);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    List<Shopcart> selectByExample(ShopcartExample example);

    Shopcart selectByPrimaryKey(String shopcartid);

    int updateByExampleSelective(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByExample(@Param("record") Shopcart record, @Param("example") ShopcartExample example);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);

    List<GoodsShopcart> selectShopcart(String userid);
}