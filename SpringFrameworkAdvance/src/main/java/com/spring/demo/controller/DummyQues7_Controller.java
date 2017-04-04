package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/dummyQues7")
public class DummyQues7_Controller {

    @RequestMapping("/firstnameAndLastname/{firstname}/{lastname}")
    @ResponseBody
    String returnFullName(@PathVariable Map<String,String> map) {

        return map.get("firstname") + "is Sargam" + " " + map.get("lastname") + "is Sachdeva";
    }

}
