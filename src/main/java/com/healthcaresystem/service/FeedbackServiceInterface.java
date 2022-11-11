package com.healthcaresystem.service;

import java.util.List;

import com.healthcaresystem.model.Feedback;
import com.healthcaresystem.model.User;

public interface FeedbackServiceInterface {

	List<Feedback> findAll();
	
	Feedback addFeedback(Feedback f);

}
