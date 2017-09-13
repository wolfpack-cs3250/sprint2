package com.banner.bannerApplication.controllers;

/*
*   Here will lie all of the CRUD operations for Sprint2
*   - Sal
*
*/

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class UserController {
    @RequestMapping("product/{id}")
    public String showProduct(@PathVariable Integer id) {
        return "index";
    }

}
