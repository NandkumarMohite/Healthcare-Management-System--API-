package com.healthcaresystem.service;


import com.healthcaresystem.model.Robot;



public interface RobotServiceInterface {

	public Robot getUserDetails(int Id);
	boolean  addUser(Robot u);
}
