package com.jezh.hillel.controller;

import com.jezh.hillel.dao.UserDao;
import com.jezh.hillel.model.User;
import com.jezh.hillel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Ежище on 12.07.2017.
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ModelAndView validateUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("user_check_page");
        return modelAndView;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public /*@ResponseBody*/ String checkUser(@ModelAttribute("userFromServer") User user) {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword()))
            return "redirect:/resources/html/valid.html";
        return "redirect:/resources/html/invalid.html";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/resources/html/final.htm";
    }
    @RequestMapping(value = "/hw", method = RequestMethod.GET)
    public String helloWorld() {
        return "index";
    }

}
