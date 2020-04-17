package com.szptest.demo.service.impl;

import com.szptest.demo.dao.AddressDao;
import com.szptest.demo.entity.Address;
import com.szptest.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressDao addressDao;
    @Override
    public void insertAdd(Address address) {
        addressDao.save(address);

    }
}
