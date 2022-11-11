package com.healthcaresystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.model.Feedback;

import com.healthcaresystem.service.FeedbackServiceInterface;
@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackServiceInterface feedbackServiceInterface;
	
	
	
	
	@GetMapping("/displayfeedback")
	public List<Feedback> displayAllFeedback()
	{
		return feedbackServiceInterface.findAll();
	}

	
	@PostMapping("/addfeedback")
	public Feedback addFeedback(@RequestBody Feedback f) {
		
		
		return feedbackServiceInterface.addFeedback(f); 
		
	}
}
