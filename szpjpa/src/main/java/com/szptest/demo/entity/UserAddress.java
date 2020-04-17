package com.szptest.demo.entity;

import java.io.Serializable;

public class UserAddress  implements Serializable {
    private static final long serialVersionUID = -6347911007178390219L;

    private Users users;
    private Address address;


    public UserAddress(Users users){
        Address address=new Address();
        this.address=address;
        this.users=users;
    }

    public UserAddress(Address address){
        Users users=new Users();
        this.address=address;
        this.users=users;
    }

    public UserAddress(Address address,Users users){
        this.address=address;
        this.users=users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
