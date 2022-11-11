package com.healthcaresystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcaresystem.dao.FeedbackDaoInterface;

import com.healthcaresystem.model.Feedback;

@Service
public class FeedbackService implements FeedbackServiceInterface {
	
	@Autowired
	private FeedbackDaoInterface feedbackDaoInterface;
	
	
	
	
	@Override
	public List<Feedback> findAll() {
		
		List<Feedback> depBd =feedbackDaoInterface.findAll();
		return depBd;
	}

	@Override
	public Feedback addFeedback(Feedback f) {
		// TODO Auto-generated method stub
		boolean added = false;
		try {
			feedbackDaoInterface.save(f);
			added=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return f;
	}

}
