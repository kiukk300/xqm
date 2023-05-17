package com.example.xqm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.xqm.dto.User;
import com.example.xqm.mapper.UserMapper;

@Component
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	
	public String getUser(User user) {
		
		User DBuser = userMapper.getUser(user.getUserName(),user.getPassword());
		
		if(DBuser == null) {
			return "error";
		}else {
			return "OK";
		}
	}
}
