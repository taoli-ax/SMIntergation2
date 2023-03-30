package com.coh.mapper.impl;

import com.coh.mapper.UserDao;
import com.coh.pojo.User;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("saving user");
    }
}
