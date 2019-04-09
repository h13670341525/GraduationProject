package com.dhu.service.impl;

import com.dhu.constant.GoodsConstant;
import com.dhu.dao.GoodsMapper;
import com.dhu.dao.GoodsbigtypeMapper;
import com.dhu.dao.GoodstypeMapper;
import com.dhu.domain.Goods;
import com.dhu.domain.Goodsbigtype;
import com.dhu.domain.GoodstypeExample;
import com.dhu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 黄朝胜
 * @Title: GoodsServiceImpl
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/611:22
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodstypeMapper goodstypeMapper;

    @Autowired
    private GoodsbigtypeMapper goodsbigtypeMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    public List fetchHomeInfo() {
        List result = new ArrayList();
        List<Goodsbigtype> goodsbigtypes = goodsbigtypeMapper.selectByExample(null);
        for(Goodsbigtype goodsbigtype:goodsbigtypes){
            Map<String,Object> map = new HashMap<String, Object>();
            GoodstypeExample goodstypeExample = new GoodstypeExample();
            goodstypeExample.createCriteria().andGoodsbigtypeidEqualTo(goodsbigtype.getGoodstypeid());
            map.put(GoodsConstant.GOODS_BIG_TYPE,goodsbigtype);
            map.put(GoodsConstant.GOODS_TYPE,goodstypeMapper.selectByExample(goodstypeExample));
            map.put(GoodsConstant.GOODS_LIST,goodsMapper.selectByGoodsbigtype(goodsbigtype.getGoodstypeid()));
            result.add(map);
        }
        return result;
    }

    public Goods fetchGoods(String goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }
}
