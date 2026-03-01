package com.accmang.AccManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userAcc")
public class AccountController {

    @GetMapping("/management")
    public String test() {
        return "Account Service Running";
    }

    @GetMapping("/testing")
    public String test1() {
        return "Service Working";
    }

    @GetMapping("/details")
    public String details() {
        return "Account Service Working";
    }


    @GetMapping("/detailss")
    public String details1() {
        return "Account Service Working...!!";
    }


    @GetMapping("/detailsss")
    public String details2() {
        return "Account Service Working !!";
    }
}




