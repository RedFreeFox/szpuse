package com.szptest.demo.dao;


import com.szptest.demo.entity.UserAddress;
import com.szptest.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<Users,Integer> {

    @Query(value = "SELECT new com.szptest.demo.entity.UserAddress(a, u) FROM Users u, Address a WHERE u.uid = a.uid")
     public List<UserAddress> findUserAddress();

}
