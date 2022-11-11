package com.healthcaresystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcaresystem.dao.RobotDaoInterface;
import com.healthcaresystem.model.Robot;
import com.healthcaresystem.model.User;


@Service
public class RobotService implements RobotServiceInterface{
	@Autowired
	private RobotDaoInterface robotDaoInterface;


	@Override
	public boolean addUser(Robot u) {
		boolean added = false;
		try {
			robotDaoInterface.save(u);
			added=true;
		} catch (Exception e) {
			
		}
		return added;
	}


	@Override
	public Robot getUserDetails(int RobotId) {
		Optional<Robot> x = robotDaoInterface.findById(RobotId);
		Robot r=new Robot();
		
		if(x.isPresent())
		{
			 r = x.get();
			
		}
		return r;
		
	}
}
