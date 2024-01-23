package com.mateuszKulec.KursyOnline.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloLogin {

    @GetMapping("/hello")
    public String get(){
        return "Hello";
    }
}
