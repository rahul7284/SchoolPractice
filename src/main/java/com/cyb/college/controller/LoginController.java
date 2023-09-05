package com.cyb.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.college.entity.LoginDetails;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
    @Autowired
    private LoginRepository loginRepo;
    
    @GetMapping(path = "/validateLogin/{userName}/{userPwd}")
    public LoginDetails validateLogin(@PathVariable("userName") String userName,
            @PathVariable("userPwd") String userPwd) {
        return loginRepo.findByUserNameAndUserPwd(userName, userPwd);
    }
}
