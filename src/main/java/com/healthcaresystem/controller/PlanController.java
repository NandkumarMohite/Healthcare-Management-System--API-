package com.healthcaresystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.model.Plan;
import com.healthcaresystem.model.User;
import com.healthcaresystem.service.PlanServiceInterface;
@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class PlanController {


	
	@Autowired
	private PlanServiceInterface planServiceInterface;
	
	
	
	
	@PostMapping("/Getplan")
    public ResponseEntity<?> FindByPlanId(@RequestBody Plan plan)
    {
      
      plan= planServiceInterface.login(plan);
      
      if(plan != null)
      {
        return new ResponseEntity<Plan>(plan,HttpStatus.OK);
      }else 
      {
        return null;
      }
    
      
    }
	
	@GetMapping("/Displayplan")
	public List<Plan> getAllPlan(){
		return planServiceInterface.findAll();
	}
	
	@PostMapping("/addplan")
	public boolean addPlan(@RequestBody Plan p) {
		
		
		return planServiceInterface.addPlan(p); 		
	}

	@PutMapping("/update/{planId}")
	
    public Plan updatePlan(@RequestBody Plan pl,@PathVariable("planId") int planId)
    {
		return planServiceInterface.updatePlan(pl,planId);
       
    }
	
	

	@DeleteMapping("/deleteplan/{planId}")
    public String deletePlanById(@PathVariable("planId") int planId)
    {
        planServiceInterface.deletePlanById(planId);
  
        return "Deleted Successfully";
    }
}
