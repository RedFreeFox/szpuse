package com.szptest.demo.service.impl;

import com.szptest.demo.dao.UserDao;
import com.szptest.demo.entity.UserAddress;
import com.szptest.demo.entity.Users;
import com.szptest.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    UserDao userDao;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override
    public void svaeUsers(Users users) {
        userDao.save(users);
        //int a=5/0;
    }

    @Override
    public List<Users> getUsers() {
        return userDao.findAll();
    }
    @Override
    public List<UserAddress> getUserAdress() {
        return userDao.findUserAddress();
    }
}
