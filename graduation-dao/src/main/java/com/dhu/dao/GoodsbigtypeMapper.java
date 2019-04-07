package com.dhu.dao;

import com.dhu.domain.Goodsbigtype;
import com.dhu.domain.GoodsbigtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsbigtypeMapper {
    int countByExample(GoodsbigtypeExample example);

    int deleteByExample(GoodsbigtypeExample example);

    int deleteByPrimaryKey(String goodstypeid);

    int insert(Goodsbigtype record);

    int insertSelective(Goodsbigtype record);

    List<Goodsbigtype> selectByExample(GoodsbigtypeExample example);

    Goodsbigtype selectByPrimaryKey(String goodstypeid);

    int updateByExampleSelective(@Param("record") Goodsbigtype record, @Param("example") GoodsbigtypeExample example);

    int updateByExample(@Param("record") Goodsbigtype record, @Param("example") GoodsbigtypeExample example);

    int updateByPrimaryKeySelective(Goodsbigtype record);

    int updateByPrimaryKey(Goodsbigtype record);
}