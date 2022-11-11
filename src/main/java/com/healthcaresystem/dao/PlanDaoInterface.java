package com.healthcaresystem.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.healthcaresystem.model.Plan;
import com.healthcaresystem.model.User;

@Repository
public interface PlanDaoInterface  extends JpaRepository<Plan, Integer>{
	public Plan findByPlanId(int planId);

}