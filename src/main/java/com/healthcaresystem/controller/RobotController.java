package com.healthcaresystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.model.Robot;
import com.healthcaresystem.service.RobotServiceInterface;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class RobotController {
	
	@Autowired
	private RobotServiceInterface robotServiceInterface;
	
	
	@GetMapping("/getRobotPlan/{Id}")
	public Robot getUserDetails(@PathVariable int Id) {
		
				return robotServiceInterface.getUserDetails(Id);
		
	}
	
	@PostMapping("/addToChart")
	public boolean addUser(@RequestBody Robot r) {
		
		return robotServiceInterface.addUser(r); 
		
	}

}
