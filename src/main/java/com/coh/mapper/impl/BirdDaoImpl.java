package com.coh.mapper.impl;

import com.coh.mapper.BirdDao;
import com.coh.pojo.Bird;

public class BirdDaoImpl implements BirdDao {


    @Override
    public void save(Bird bird) {
        System.out.println("bird spring");
    }
}
