package com.healthcaresystem.service;

import java.util.List;

import com.healthcaresystem.model.Plan;
import com.healthcaresystem.model.User;



public interface PlanServiceInterface {
	
	
//	public Plan getPlanDetails(int planId);
	public boolean addPlan(Plan p);
	
	public Plan updatePlan(Plan p, int planId);
	public String deletePlanById(int planId);

	public List<Plan> findAll();
	Plan login(Plan plan);
	
}
