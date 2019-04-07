package com.dhu.service;

import com.dhu.domain.Address;

import java.util.List;

public interface AddressService {
    void addAddress(Address address,String token);
    List fetchAddresses(String token);
}
