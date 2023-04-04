package com.movielist.apigateway.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String index () {
        return "Greetings from Spring Boot!";
    }

}
