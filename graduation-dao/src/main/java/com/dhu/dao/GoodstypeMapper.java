package com.dhu.dao;

import com.dhu.domain.Goodstype;
import com.dhu.domain.GoodstypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodstypeMapper {
    int countByExample(GoodstypeExample example);

    int deleteByExample(GoodstypeExample example);

    int deleteByPrimaryKey(String goodstypeid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    List<Goodstype> selectByExample(GoodstypeExample example);

    Goodstype selectByPrimaryKey(String goodstypeid);

    int updateByExampleSelective(@Param("record") Goodstype record, @Param("example") GoodstypeExample example);

    int updateByExample(@Param("record") Goodstype record, @Param("example") GoodstypeExample example);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}