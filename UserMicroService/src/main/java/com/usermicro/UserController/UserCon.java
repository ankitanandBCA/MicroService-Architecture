package com.usermicro.UserController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserCon {

    @GetMapping("/status/chek")
    public String stutas()
    {
        return "hello world";
    }
}
