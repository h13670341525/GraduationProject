package com.dhu.service.impl;

import com.dhu.dao.AddressMapper;
import com.dhu.domain.Address;
import com.dhu.domain.AddressExample;
import com.dhu.helper.JwtHelper;
import com.dhu.helper.UuidHelper;
import com.dhu.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄朝胜
 * @Title: AddressServiceImpl
 * @ProjectName graduationparent
 * @Description: TODO
 * @date 2019/4/619:55
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    public void addAddress(Address address,String token) {
        String userid = JwtHelper.getUserid(token);
        address.setUserid(userid);
        address.setAddressid(UuidHelper.getUuid());
        addressMapper.insert(address);
    }

    public List fetchAddresses(String token) {
        String userid = JwtHelper.getUserid(token);
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria().andUseridEqualTo(userid);
        return addressMapper.selectByExample(addressExample);
    }
}
