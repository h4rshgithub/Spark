package com.security.SpringSecurityP02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/contactUs")
    public String contactUs(){
        return " you can contst at : 3938748784";
    }
    @GetMapping("/about")
    public String about(){
        return "harsh Singh founder of sbi ";
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "money successfully transferred ";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome admin ";
    }
}
