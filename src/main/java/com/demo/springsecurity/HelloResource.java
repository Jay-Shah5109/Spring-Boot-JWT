package com.demo.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

    @RequestMapping("/hello")
    public String helloWord() {
        return "Hello World!";
    }
}
