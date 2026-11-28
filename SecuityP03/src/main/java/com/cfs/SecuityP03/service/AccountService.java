package com.cfs.SecuityP03.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.stereotype.Service;

@Service
@EnableMethodSecurity
public class AccountService {

    @PreAuthorize("hasRole('USER')")
     public String getBalance(){
         return "Your balance is =80000";
     }

    @PreAuthorize("hasRole('ADMIN')")
    public String closeAccount(){
        return "Account closed ";
    }
}
