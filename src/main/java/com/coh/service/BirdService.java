package com.coh.service;


import com.coh.mapper.UserDao;
import com.coh.pojo.Bird;
import com.coh.pojo.User;

import java.util.List;
import java.util.Map;

public class BirdService {

    private List<String> strings;
    private Map<String,String> maps;




    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }


    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

}
