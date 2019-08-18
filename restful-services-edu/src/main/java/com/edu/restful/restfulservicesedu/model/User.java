package com.edu.restful.restfulservicesedu.model;

public class User {
	private String userId;
	private String firstName;
	private String lastName;
	
	public User( String firstName, String lastName, String userId){
		this.userId= userId;
		this.firstName= firstName;
		this.lastName= lastName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
