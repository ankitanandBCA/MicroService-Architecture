package com.example.getway.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/calling")
    public String call() {
        return "API is calling";
    }

}
