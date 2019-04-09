package com.dhu.shopcart;

import com.dhu.ReturnResult;
import com.dhu.domain.Shopcart;
import com.dhu.service.ShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 黄朝胜
 * @Title: ShopcartController
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/918:54
 */
@Controller
public class ShopcartController {

    @Autowired
    private ShopcartService shopcartService;

    @ResponseBody
    @RequestMapping("/addShopcart.do")
    public ReturnResult addShopcart(@CookieValue String token, @RequestBody Shopcart shopcart){
        try{
            shopcartService.addShopcart(shopcart,token);
            return ReturnResult.returnResult(ShopcartEnum.ADD_SHOPCART_SUCESS.getCode(),ShopcartEnum.ADD_SHOPCART_SUCESS.getMsg());
        }catch (Exception e){
            return ReturnResult.returnResult(ShopcartEnum.SERVER_ERROR.getCode(),ShopcartEnum.SERVER_ERROR.getMsg());
        }
    }

    @ResponseBody
    @RequestMapping("/fetchShopcart.do")
    public ReturnResult fetchShopcart(@CookieValue String token){
        try{
            return ReturnResult.returnResult(ShopcartEnum.FETCH_SHOPCART_SUCESS.getCode(),ShopcartEnum.FETCH_SHOPCART_SUCESS.getMsg(),shopcartService.fetchShopcart(token));
        }catch (Exception e){
            return ReturnResult.returnResult(ShopcartEnum.SERVER_ERROR.getCode(),ShopcartEnum.SERVER_ERROR.getMsg());
        }
    }
}
