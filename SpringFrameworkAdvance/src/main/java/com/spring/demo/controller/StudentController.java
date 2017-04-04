package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//Ques-5
@Controller
@RequestMapping("/init")
public class StudentController {

    @ResponseBody
    @RequestMapping("/hello")
    ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message", "Hello World!!!!");
        return modelAndView;
    }
}
