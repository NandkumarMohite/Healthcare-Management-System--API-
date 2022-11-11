package com.healthcaresystem.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.healthcaresystem.dao.PlanDaoInterface;

import com.healthcaresystem.model.Plan;
import com.healthcaresystem.model.User;




@Service
public  class PlanService implements PlanServiceInterface {
	
	
	@Autowired
	private PlanDaoInterface planDaoInterface;
	

//	@Override
//	public Plan getPlanDetails(int planId) {
//		// TODO Auto-generated method stub
//		
//		Optional<Plan> y = planDaoInterface.findById(planId);
//		Plan p = new Plan("####",0,0000);
//		if(y.isPresent())
//		{
//			 p = y.get();
//			
//		}
//		return p;
//	}

	@Override
	public boolean addPlan(Plan p) {
		// TODO Auto-generated method stub
		boolean added = false;
		try {
			planDaoInterface.save(p);
			added=true;
		} catch (Exception e) {
			
		}
		return added;
	}

	@Override
	// Update operation
    public Plan updatePlan(Plan p, int planId)
    {
    	Plan depDB = planDaoInterface.findById(planId).get();
  
        if (Objects.nonNull(p.getPlanType()) && !"".equalsIgnoreCase(p.getPlanType())) {
            depDB.setPlanType(p.getPlanType());
        }
  

  
        return planDaoInterface.save(depDB);
    }

	@Override
	public String deletePlanById(int planId) {
		Plan depDB = planDaoInterface.findById(planId).get();
	
		planDaoInterface.deleteById(planId);
		return "";
	}

	@Override
	public List<Plan> findAll() {
		// TODO Auto-generated method stub
		List<Plan> depBd =planDaoInterface.findAll();
		return depBd;
	}
	 public Plan login(Plan plan) 
	    {
	      return planDaoInterface.findByPlanId(plan.getPlanId());
	   }
}
   

