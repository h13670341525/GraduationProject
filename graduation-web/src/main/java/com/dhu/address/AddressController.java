package com.dhu.address;

import com.dhu.ReturnResult;
import com.dhu.domain.Address;
import com.dhu.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 黄朝胜
 * @Title: AddressController
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/619:52
 */

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @ResponseBody
    @RequestMapping("/addAddress.do")
    public ReturnResult addAddress(@RequestBody Address address, @CookieValue String token){
        try{
            addressService.addAddress(address,token);
            return ReturnResult.returnResult(AddressEnum.ADD_ADDRESS_SUCCESS.getCode(),AddressEnum.ADD_ADDRESS_SUCCESS.getMsg());
        }catch (Exception e){
            return ReturnResult.returnResult(AddressEnum.SERVER_ERROR.getCode(),AddressEnum.SERVER_ERROR.getMsg());
        }
    }

    @ResponseBody
    @RequestMapping("/fetchAddresses.do")
    public ReturnResult fetchAddress(@CookieValue String token){
        try{
            return ReturnResult.returnResult(AddressEnum.FETCH_ADDRESS_SUCCESS.getCode(),AddressEnum.FETCH_ADDRESS_SUCCESS.getMsg(),addressService.fetchAddresses(token));
        }catch (Exception e){
            return ReturnResult.returnResult(AddressEnum.SERVER_ERROR.getCode(),AddressEnum.SERVER_ERROR.getMsg());
        }
    }
}
