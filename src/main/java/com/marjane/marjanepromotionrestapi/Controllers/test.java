package com.marjane.marjanepromotionrestapi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {


    @GetMapping
    @ResponseBody
    public void test(){
        System.out.println("test");
    }

}
