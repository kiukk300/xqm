package com.example.xqm.mapper;

import org.springframework.stereotype.Repository;

import com.example.xqm.dto.User;

@Repository
public interface UserMapper {
	
    public User getUser(String userName,String password);

}
