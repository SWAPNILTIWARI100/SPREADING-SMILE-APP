package com.example.smile.model;

import android.content.Context;

public class Contact {
//    public float setPhonenumber;
//    public Context setName;
    private int id;
    private String name;
    private String phoneNumber;

    public Contact(){
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }


}

