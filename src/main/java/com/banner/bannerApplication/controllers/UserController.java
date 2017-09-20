package com.banner.bannerApplication.controllers;

/*
*   Here will lie all of the CRUD operations for Sprint2
*   - Sal
*
*/

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.banner.bannerApplication.entities.User;
import com.banner.bannerApplication.repositories.UserRepository;

@Controller
@RequestMapping("userpage")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="")
    public @ResponseBody String userpage() {
        return "userpage";
    }

    @GetMapping(path="create")
    public String create(){
        return"userpage.add";
    }

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String firstname,
                                            @RequestParam String lastname) {
        User n = new User();
        n.setFirstName(firstname);
        n.setLastName(lastname);
        userRepository.save(n);
        return "Saved";
    }

        /*
    @GetMapping(value="/new")
    public ModelAndView createStudent() {
        return new ModelAndView( "students/students.create", "student, new Student());
    }
    */


    /*
    @GetMapping(path="/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name );
        return "userpage";
    }

//    @RequestMapping(method=POST)
    public String greeting(@RequestParam(value="firstname", required=true) String name);

    */
}
