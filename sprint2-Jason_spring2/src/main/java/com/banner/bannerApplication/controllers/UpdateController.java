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
public class UpdateController {

    @Autowired
    private UserRepository updateRepository;

    @GetMapping(path="/Update")
    public @ResponseBody String updateUser(@RequestParam String firstname, @RequestParam String lastname){

        User n = new User(firstname,lastname);
        n.setFirstName(firstname);
        n.setLastName(lastname);
        updateRepository.save(n);
        return "Updated";
    }

}
