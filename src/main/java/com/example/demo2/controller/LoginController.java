package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 94557
 */
@Controller
public class LoginController {


    @RequestMapping("/login")
    public ModelAndView getLogin(){

        ModelAndView model = new ModelAndView();
        model.setViewName("jsp/login");
        return model;

    }

    @RequestMapping("/index")
    public ModelAndView getIndex(){

        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;

    }

}
