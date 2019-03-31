package com.dhu.dao;

import com.dhu.domain.Gorder;
import com.dhu.domain.GorderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GorderMapper {
    int countByExample(GorderExample example);

    int deleteByExample(GorderExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(Gorder record);

    int insertSelective(Gorder record);

    List<Gorder> selectByExample(GorderExample example);

    Gorder selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") Gorder record, @Param("example") GorderExample example);

    int updateByExample(@Param("record") Gorder record, @Param("example") GorderExample example);

    int updateByPrimaryKeySelective(Gorder record);

    int updateByPrimaryKey(Gorder record);
}