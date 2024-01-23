package com.mateuszKulec.KursyOnline.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloLogin {

    @GetMapping("/hello")
    public String get(){
        return "Hello";
    }

    @GetMapping("/user")
    public String helloUser(){
        return "Hello User";
    }

    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello Admin";
    }

}
