package com.szptest.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "szp_address")
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private int uid;
    private String addressOne;

    public Address() {
        super();
    }

    public Address(int uid, String addressOne) {
        this.uid = uid;
        this.addressOne = addressOne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }
}
