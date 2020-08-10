package com.ylizma.springsecurityjwt;


import org.springframework.stereotype.Controller;

@Controller
public class HelloResource {

    public String hello(){
        return "Hello world";
    }

}
