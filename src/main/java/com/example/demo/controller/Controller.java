package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.DBRelated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

    @Autowired
    DBRelated DBRelated;

    @RequestMapping("/hello")
    public ModelAndView hello(Model model) throws Exception {
        //params 받기, 그 파라미터로 user 객체 만들기

        User user = new User("", "", "");
        //select, 없으면 insert

        System.out.println(DBRelated.insertUser(user));
        return new ModelAndView("index");
    }
}