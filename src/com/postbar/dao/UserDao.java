package com.postbar.dao;

import com.postbar.entity.User;

import java.util.List;

public interface UserDao {

    public int add(User user);
    public int delete(int id);
    public int update(User user);
    public List<User> query(String name);
}
