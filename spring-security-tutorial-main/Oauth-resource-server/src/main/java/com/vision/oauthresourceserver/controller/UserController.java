package com.vision.oauthresourceserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vision.oauthresourceserver.dto.UserDto;
import com.vision.oauthresourceserver.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

    @GetMapping("/api/users")
    public String[] getUser() {
       String [] arr = new String[]{"Aloke", "Jue","Mike"};
    	/*List<UserDto> dtos =userService.loadAllUser();
    	String[] arr  = dtos.stream().toArray(String[] ::new);*/
    	return arr;
    }
}
