package com.cfs.SecuityP03.controller;

import com.cfs.SecuityP03.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BanlController {

    @Autowired
    AccountService service;

    @GetMapping("/balance")  // user can access
    public String getBalance(){
        return service.getBalance();
    }

    @PostMapping("/close")   // only employee can access
    public String closeAccount (){
        return service.closeAccount();

    }

    @GetMapping("/about")
    public String sbout(){
        return "Hum lunch par haii";
    }
}
