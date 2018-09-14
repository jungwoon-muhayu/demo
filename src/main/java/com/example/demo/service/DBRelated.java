package com.example.demo.service;

import com.example.demo.mapper.DBMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class DBRelated {
    @Autowired
    DBMapper dbMapper;

    public int insertUser(User user) throws Exception {
        int result = 0;
        result = dbMapper.insertUser(user);
        return result;
    }

}
