package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DummyController {

    @RequestMapping("/")   //Ques3

    String index() {

        return "index";
    }

    @RequestMapping("/index2")   //Ques4
    @ResponseBody
    String index2() {

        return ">>>>>returning from method>>>>>Hello World!!!!!!" ;
    }
}
