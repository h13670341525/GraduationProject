package com.dhu.user;

import com.dhu.ReturnResult;
import com.dhu.domain.User;
import com.dhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 黄朝胜
 * @Title: UserController
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/618:00
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/info.do")
    public ReturnResult info(@CookieValue String token){
        try {
            User user = userService.info(token);
            if(user ==null){
                return ReturnResult.returnResult(UserEnum.USER_NOT_EXIST.getCode(),UserEnum.USER_NOT_EXIST.getMsg());
            }
            else{
                return ReturnResult.returnResult(UserEnum.SEARCH_INFO_SUCCESS.getCode(),UserEnum.SEARCH_INFO_SUCCESS.getMsg(),user);
            }
        }catch (Exception e){
            return ReturnResult.returnResult(UserEnum.SERVER_ERROR.getCode(),UserEnum.SERVER_ERROR.getMsg());
        }
    }
}
