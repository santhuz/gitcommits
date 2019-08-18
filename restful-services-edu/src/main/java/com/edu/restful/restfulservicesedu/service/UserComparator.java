package com.edu.restful.restfulservicesedu.service;

import java.util.Comparator;

import com.edu.restful.restfulservicesedu.model.User;

public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {
		return u1.getFirstName().compareToIgnoreCase(u2.getLastName());
	}

}
