package com.dhu.service.impl;

import com.dhu.constant.EmailConstant;
import com.dhu.constant.UserConstant;
import com.dhu.dao.UserMapper;
import com.dhu.domain.User;
import com.dhu.domain.UserExample;
import com.dhu.helper.*;
import com.dhu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 黄朝胜
 * @Title: LoginServiceImpl
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/3/3119:17
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    /*
     *  用户登陆业务
     */
    public Map<String, Object> login(String useremail, String userpassword) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                   .andUseremailEqualTo(useremail)
                   .andUserpasswordEqualTo(MD5Helper.EncoderByMd5(userpassword));
        List<User> users = userMapper.selectByExample(userExample);
        Map<String,Object> result = new HashMap<String, Object>();
        /*
         *登录失败;
         */
        if(users.size()==0){
            result.put(LOGIN_STATUS,false);
        }
        /*
         * 登录成功;
         */
        else{
           User user = users.get(0);
            result.put(LOGIN_STATUS,true);
            result.put(USER_NAME,user.getUsername());
            result.put(USER_TYPE,user.getUsertype());
            result.put(LOGIN_TOKEN,JwtHelper.sign(user.getUserid(),user.getUsertype()));
        }
        return result;
    }

    /*
     *用户注册业务
     */
    public boolean register(String useremail, String userpassword) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseremailEqualTo(useremail);
        /*
         *  同步防止读已提交造成脏读数据
         */
        synchronized (useremail.intern()){
            /*
             *   注册成功
             */
            if(userMapper.countByExample(userExample)==0){
                User user = new User();
                user.setUserid(UuidHelper.getUuid());
                user.setUserpassword(MD5Helper.EncoderByMd5(userpassword));
                user.setUseremail(useremail);
                user.setUseraccount(UserConstant.DEFAULT_USERACCOUNT);
                user.setUsername(UserConstant.DEFAULT_USERNAME);
                user.setUsertype(UserConstant.DEFAULT_USERTYPE);
                user.setUserimage(UserConstant.DEFAULT_USERIMAGE);
                userMapper.insert(user);
                return true;
            }
            /*
             *  注册失败
             */
            else{
                return false;
            }
        }
    }

    /*
     * 用户找回密码业务
     */
    public boolean reminder(String useremail) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                   .andUseremailEqualTo(useremail);
        List<User> users = userMapper.selectByExample(userExample);
        /*
         * 未找到该邮箱,找回密码失败
         */
        if(users.size()==0){
            return false;
        }
        /*
         *  找到该邮箱，修改密码;
         */
        else{
            User user = users.get(0);
            String newPassword = PswHelper.generatePsw();
            user.setUserpassword(MD5Helper.EncoderByMd5(newPassword));
            userMapper.updateByPrimaryKey(user);
            EmailHelper.sendMail(useremail,EmailConstant.RESET_PSW,newPassword);
            return true;
        }
    }
}
