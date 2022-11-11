package com.healthcaresystem.service;

import java.util.List;

import com.healthcaresystem.model.Coach;
import com.healthcaresystem.model.User;



public interface CoachServiceInterface {
	
	public Coach getCoachDetails(int coachId);
	public boolean addCoach(Coach r);
	
	public Coach updateCoach(Coach c, int coachId);
	public String deleteCoachById(int coachId);
	public List<Coach> findAll();
	
	
}
