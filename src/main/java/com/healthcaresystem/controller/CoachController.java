package com.healthcaresystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.model.Coach;
import com.healthcaresystem.service.CoachServiceInterface;


@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class CoachController {
	
	@Autowired
	private CoachServiceInterface coachServiceInterface;
	
	@GetMapping("/diplayCoach")
	public List<Coach> displayAllUser()
	{
		return coachServiceInterface.findAll();
		
	}
	
	
	
	@GetMapping("/getcoachdetails/{coachId}")
	public Coach getCoachDetails(@PathVariable int coachId) {
		
				return coachServiceInterface.getCoachDetails(coachId);
		
	}
	
	
	
	
	@PostMapping("/addcoach")
	public boolean addCoach(@RequestBody Coach c) {
		
		
		return coachServiceInterface.addCoach(c); 
		
	}

	@PutMapping("/updatecoach/{coachId}")
	
    public Coach updateCoach(@RequestBody Coach c,@PathVariable("coachId") int coachId)
    {
		return coachServiceInterface.updateCoach(c,coachId);
       
    }
	
	
    @DeleteMapping("/deletecoach/{coachId}")
    public String deleteCoachById(@PathVariable("coachId") int coachId)
    {
        coachServiceInterface.deleteCoachById(coachId);
  
        return "Deleted Successfully";
    }
}


