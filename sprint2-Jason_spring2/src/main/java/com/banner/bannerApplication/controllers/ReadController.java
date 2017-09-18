package com.banner.bannerApplication.controllers;

import com.banner.bannerApplication.entities.User;
import com.banner.bannerApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.List;

@Controller
@RequestMapping
public class ReadController {
    @Autowired
    private UserRepository readRepository;

    @GetMapping("/Read")
    public List<User> getAllUser(){
        return readRepository.getAllUser();
    }

    public User getUser(String firstName, String lastName){
        return readRepository.getUser(firstName, lastName);
    }
}
