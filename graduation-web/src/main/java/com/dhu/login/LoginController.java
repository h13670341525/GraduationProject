package com.dhu.login;

import com.dhu.ReturnResult;
import com.dhu.StringReg;
import com.dhu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 黄朝胜
 * @Title: LoginController
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/2910:01
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    /*
     *  登录接口
     */
    @ResponseBody
    @RequestMapping("/login.do")
    public ReturnResult login(String useremail,String userpassword){
        try{
            Map<String, Object> result = loginService.login(useremail, userpassword);
            /*
             *   登录成功;
             */
            if((boolean)result.get(LoginService.LOGIN_STATUS)){
                return ReturnResult.returnResult(LoginEnum.LOGIN_SUCCESS.getCode(),LoginEnum.LOGIN_SUCCESS.getMsg(),result);
            }

            /*
             *   登录失败
             */
            else{
                return ReturnResult.returnResult(LoginEnum.LOGIN_FAIL.getCode(),LoginEnum.LOGIN_FAIL.getMsg());
            }
        }catch (Exception e){
          return ReturnResult.returnResult(LoginEnum.SERVER_ERROR.getCode(),LoginEnum.SERVER_ERROR.getMsg());
        }
    }

    /*
     *  注册接口
     */
    @ResponseBody
    @RequestMapping("/register.do")
    public ReturnResult register(String useremail,String userpassword){

        try {
            /*
             *   邮箱和密码符合规则
             */
            if (StringReg.isEmail(useremail) && StringReg.isPassword(userpassword)) {
                /*
                 *   注册成功
                 */
                if (loginService.register(useremail, userpassword)) {
                    return ReturnResult.returnResult(LoginEnum.REGISTER_SUCCESS.getCode(), LoginEnum.REGISTER_SUCCESS.getMsg());
                }

                /*
                 *注册失败
                 */
                else {
                    return ReturnResult.returnResult(LoginEnum.REGISTER_EMAIL_REPEAT.getCode(), LoginEnum.REGISTER_EMAIL_REPEAT.getMsg());
                }
            }

            /*
             *  邮箱不符合规则
             */
            else if(!StringReg.isEmail(useremail)){
                return ReturnResult.returnResult(LoginEnum.REGISTER_EMAIL_FAIL.getCode(), LoginEnum.REGISTER_EMAIL_FAIL.getMsg());
            }

            /*
             * 密码不符合规则
             */
            else {
                return ReturnResult.returnResult(LoginEnum.REGISTER_PASSWORD_FAIL.getCode(), LoginEnum.REGISTER_PASSWORD_FAIL.getMsg());
            }
        }catch (Exception e){
            return ReturnResult.returnResult(LoginEnum.SERVER_ERROR.getCode(),LoginEnum.SERVER_ERROR.getMsg());
        }
    }

    /*
     *找回密码接口
     */
    @ResponseBody
    @RequestMapping("/reminder.do")
    public ReturnResult reminder(String useremail){
        try{
            /*
             * 找回密码成功
             */
            if(loginService.reminder(useremail)){
               return ReturnResult.returnResult(LoginEnum.REMINDER_SUCCESS.getCode(),LoginEnum.REMINDER_SUCCESS.getMsg());
            }

            /*
             * 找回密码失败
             */
            else{
               return ReturnResult.returnResult(LoginEnum.REMINDER_FAIL.getCode(),LoginEnum.REMINDER_FAIL.getMsg());
            }
        }catch (Exception e){
            return ReturnResult.returnResult(LoginEnum.SERVER_ERROR.getCode(),LoginEnum.SERVER_ERROR.getMsg());
        }
    }

    /*
     *   验证码接口
     */
    @ResponseBody
    @RequestMapping("/idcode.do")
    public ReturnResult identifyCode(String useremail){
        try{
            String result = loginService.identifyCode(useremail);
            /*
             *   邮箱未被注册
             */
            if(result == null){
                return ReturnResult.returnResult(LoginEnum.REMINDER_FAIL.getCode(),LoginEnum.REMINDER_FAIL.getMsg());
            }

            /*
             *  发送验证码成功
             */
            else{
                return ReturnResult.returnResult(LoginEnum.SENDCODE_SUCCESS.getCode(),LoginEnum.SENDCODE_SUCCESS.getMsg(),result);
            }
        }catch (Exception e){
            return ReturnResult.returnResult(LoginEnum.SERVER_ERROR.getCode(),LoginEnum.SERVER_ERROR.getMsg());
        }
    }
}
