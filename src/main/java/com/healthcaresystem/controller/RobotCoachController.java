package com.healthcaresystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.model.Robot;
import com.healthcaresystem.model.Robot2;
import com.healthcaresystem.service.RobotCochServiceInterface;
import com.healthcaresystem.service.RobotServiceInterface;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class RobotCoachController {
	
	@Autowired
	private RobotCochServiceInterface robotcoachServiceInterface;
	
	@PostMapping("/addToChartCoach")
	public boolean addUser(@RequestBody Robot2 r) {
		
		
		return robotcoachServiceInterface.addUser(r); 
		
	}
	@GetMapping("/getRobotCoach/{Id}")
	public Robot2 getUserDetails(@PathVariable int Id) {
		
				return robotcoachServiceInterface.getUserDetails(Id);
		
	}

}
