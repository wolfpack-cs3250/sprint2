package com.banner.bannerApplication.controllers;

import com.banner.bannerApplication.entities.User;
import com.banner.bannerApplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class RemoveController {
    @Autowired
    private UserRepository removeRepository;
    @GetMapping(path="/Remove")
    public @ResponseBody String removeUser(@RequestParam String firstname,@RequestParam String lastname){
       //how to remove a user

       removeRepository.remove();
        return "Removed";
    }
}
