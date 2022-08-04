package com.example.oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String HelloWorld(){
        return "HelloWorld";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return "To see the text, you need to be logged in";
    }

}
