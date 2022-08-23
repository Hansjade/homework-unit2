package com.codestates.githubrepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Recommendation {

    @GetMapping("/")
    public String helloWorld(){
        return "To-Do Application !!!";
    }

}
