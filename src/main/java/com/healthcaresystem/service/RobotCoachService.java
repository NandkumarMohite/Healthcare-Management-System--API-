package com.healthcaresystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcaresystem.dao.RobotCoachDaoInterface;
import com.healthcaresystem.dao.RobotDaoInterface;
import com.healthcaresystem.model.Robot;
import com.healthcaresystem.model.Robot2;
import com.healthcaresystem.model.User;


@Service
public class RobotCoachService implements RobotCochServiceInterface{
	@Autowired
	private RobotCoachDaoInterface robotcoachDaoInterface;

	@Override
	public boolean addUser(Robot2 u) {
	System.out.println("Robot=> "+u.getRobotIdCoach() );
	Robot2 u1=new Robot2(u.getRobotIdCoach(),u.getCoachFirstName(),u.getCoachLastName(),u.getExprienceInYears());

	
	    robotcoachDaoInterface.save(u);
	return true;
	}
	
	@Override 
	public Robot2 getUserDetails(int RobotIdCoach)
	{
		Optional<Robot2> x = robotcoachDaoInterface.findById(RobotIdCoach);
		Robot2 r=new Robot2();
		
		if(x.isPresent())
		{
			 r = x.get();
			
		}
		return r;
		
	}
	
}
