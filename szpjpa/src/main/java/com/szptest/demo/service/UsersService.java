package com.szptest.demo.service;

import com.szptest.demo.dao.UserDao;
import com.szptest.demo.entity.UserAddress;
import com.szptest.demo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UsersService {

    void svaeUsers(Users users);
    List<Users> getUsers();
    List<UserAddress> getUserAdress();

}
