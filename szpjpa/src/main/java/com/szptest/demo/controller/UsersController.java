package com.szptest.demo.controller;

import com.szptest.demo.entity.Address;
import com.szptest.demo.entity.UserAddress;
import com.szptest.demo.entity.Users;
import com.szptest.demo.service.AddressService;
import com.szptest.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users/")
public class UsersController {

    @Autowired
    UsersService usersService;
    @Autowired
    AddressService addressService;

    @RequestMapping("insert/{id}")
    @ResponseBody
    public String insert(@PathVariable("id") int uid){
        Users users=new Users();

        users.setName("small");
        users.setAge(10);
        users.setAddress("sky");
        users.setUid(uid);
        usersService.svaeUsers(users);

        Address address=new Address();
        address.setUid(users.getUid());
        address.setAddressOne("south");
        addressService.insertAdd(address);

        return "ok";
    }
    @RequestMapping("get")
    @ResponseBody
    public List<UserAddress> get(){


        return usersService.getUserAdress();
    }
}
