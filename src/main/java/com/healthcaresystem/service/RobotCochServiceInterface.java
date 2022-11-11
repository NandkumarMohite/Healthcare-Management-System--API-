package com.healthcaresystem.service;


import com.healthcaresystem.model.Robot2;


public interface RobotCochServiceInterface {

	Robot2 getUserDetails(int Id);
	boolean addUser(Robot2 u);
}
