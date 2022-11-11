package com.healthcaresystem.service;

import java.util.List;

import com.healthcaresystem.model.User;



public interface UserServiceInterface {

	

	User getUserDetails(int srNo);

	boolean  addUser(User u);

	User updateUser(User u, int srNo);

	String deleteById(int srNo);

	
	List<User> findAll();

	User login(User user);

}
