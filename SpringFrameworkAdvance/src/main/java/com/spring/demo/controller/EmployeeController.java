package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Ques6
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping(value = {"/firstname/{firstname}/lastname/{lastname}"})
    @ResponseBody
    String returnName(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname) {

        return firstname + "= sargam" + " " + lastname + "= sachdeva";
    }
}
