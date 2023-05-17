package com.example.xqm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.xqm.dto.User;
import com.example.xqm.service.UserService;

@RestController
public class HelloWorldController {
	
	@Autowired
	private UserService service;
	
    @RequestMapping("/login")
    public String index(User user) {
    	
    	return service.getUser(user);
        
    }
}
