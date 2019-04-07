package com.dhu.goods;

import com.dhu.ReturnResult;
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
        @RequestMapping("/fetchGoodsType.do")
       public ReturnResult fetchGoodsType(){
           try{
               List result = goodsService.fetchGoodsType();
               return ReturnResult.returnResult(GoodsEnum.FETCH_GOODS_TYPE_SUCCESS.getCode(),GoodsEnum.FETCH_GOODS_TYPE_SUCCESS.getMsg(),result);
           }catch (Exception e){
               return ReturnResult.returnResult(GoodsEnum.SERVER_ERROR.getCode(),GoodsEnum.SERVER_ERROR.getMsg());
           }
       }
}
