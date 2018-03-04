package com.postbar.entity;

import java.sql.Blob;

//用户类
public class User {

    private int id;             //用户ID
    private String name;        //用户姓名
    private String gender;      //用户性别
    private String address;     //用户住址
    private String password;    //用户密码
    private Blob picture;       //用户头像

    public User() {
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
