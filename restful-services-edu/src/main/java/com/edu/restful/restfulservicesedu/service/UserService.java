package com.edu.restful.restfulservicesedu.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.edu.restful.restfulservicesedu.model.User;

@Component("userService1")
public class UserService {
	
	private static List<User> userList = new ArrayList<User>();
	
	static{
		User user1 = new User("Tom","M","123");
		userList.add(user1);
		User user2 = new User("Mike","J","234");
		userList.add(user2);
		Collections.sort(userList, new UserComparator());
		System.out.println(userList);
	}
	
	public User getUserById(String userId){
		//forEach.stream()
		//userList.stream() --> {}
		for (User user : userList) {
			if(user.getUserId().equals(userId)){
				return user;
			}
		}
		return null;
	}

}
