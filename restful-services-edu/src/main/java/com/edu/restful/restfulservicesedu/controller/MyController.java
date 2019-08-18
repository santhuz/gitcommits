package com.edu.restful.restfulservicesedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edu.restful.restfulservicesedu.model.User;
import com.edu.restful.restfulservicesedu.service.UserService;

@RestController
public class MyController {
	
	@Autowired
	@Qualifier("userService1")
	private UserService userService;

	@GetMapping("getUserDetails/{userId}")
	public ResponseEntity<User> getUserDetails(@PathVariable String userId){
		if(userId==null){
			System.out.println("enter user id for user details");
		}
		User user = userService.getUserById(userId);
		return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
	}
	
	//@PutMapping("putUserDetails/)
}
