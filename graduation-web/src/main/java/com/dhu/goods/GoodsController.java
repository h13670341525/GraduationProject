package com.dhu.goods;

import com.dhu.ReturnResult;
import com.dhu.domain.Goods;
import com.dhu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author 黄朝胜
 * @Title: GoodsController
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/611:39
 */

@Controller
public class GoodsController {

       @Autowired
       private GoodsService goodsService;

        @ResponseBody
        @RequestMapping("/fetchHomeInfo.do")
       public ReturnResult fetchHomeInfo(){
           try{
               List result = goodsService.fetchHomeInfo();
               return ReturnResult.returnResult(GoodsEnum.FETCH_GOODS_TYPE_SUCCESS.getCode(),GoodsEnum.FETCH_GOODS_TYPE_SUCCESS.getMsg(),result);
           }catch (Exception e){
               return ReturnResult.returnResult(GoodsEnum.SERVER_ERROR.getCode(),GoodsEnum.SERVER_ERROR.getMsg());
           }
       }

    @ResponseBody
    @RequestMapping("/fetchGoods.do")
    public ReturnResult fetchGoods(String goodsId){
            try{
                Goods goods = goodsService.fetchGoods(goodsId);
                if(goods ==null){
                    return ReturnResult.returnResult(GoodsEnum.FETCH_GOODS_NOT_EXIST.getCode(),GoodsEnum.FETCH_GOODS_NOT_EXIST.getMsg());
                }
                else{
                    return ReturnResult.returnResult(GoodsEnum.FETCH_GOODS_SUCCESS.getCode(),GoodsEnum.FETCH_GOODS_SUCCESS.getMsg(),goods);
                }
            }catch (Exception e){
                return ReturnResult.returnResult(GoodsEnum.SERVER_ERROR.getCode(),GoodsEnum.SERVER_ERROR.getMsg());
            }
    }

}
