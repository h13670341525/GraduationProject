package com.dhu.service.impl;

import com.dhu.dao.ShopcartMapper;
import com.dhu.domain.Shopcart;
import com.dhu.domain.ShopcartExample;
import com.dhu.helper.JwtHelper;
import com.dhu.helper.UuidHelper;
import com.dhu.pojo.GoodsShopcart;
import com.dhu.service.ShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄朝胜
 * @Title: ShopcartServiceImpl
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/919:09
 */
@Service
public class ShopcartServiceImpl implements ShopcartService {

    @Autowired
    private ShopcartMapper shopcartMapper;

    public void addShopcart(Shopcart shopcart, String token) {
       String userid = JwtHelper.getUserid(token);
        ShopcartExample shopcartExample = new ShopcartExample();
        shopcartExample.createCriteria()
                       .andUseridEqualTo(userid)
                       .andGoodsidEqualTo(shopcart.getGoodsid());
        List<Shopcart> shopcarts = shopcartMapper.selectByExample(shopcartExample);
        /*
         *数据库没有此条记录
         */
        if(shopcarts.size()==0){
            shopcart.setUserid(userid);
            shopcart.setShopcartid(UuidHelper.getUuid());
            shopcartMapper.insert(shopcart);
        }
        /*
         *  数据库有记录
         */
        else{
            Shopcart tem = shopcarts.get(0);
            tem.setGoodsnum(tem.getGoodsnum()+shopcart.getGoodsnum());
            shopcartMapper.updateByPrimaryKey(tem);
        }
    }

    public List<GoodsShopcart> fetchShopcart(String token) {
        String userid = JwtHelper.getUserid(token);
        return shopcartMapper.selectShopcart(userid);
    }
}
