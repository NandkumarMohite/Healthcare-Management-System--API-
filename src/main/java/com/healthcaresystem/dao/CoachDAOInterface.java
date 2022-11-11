package com.healthcaresystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcaresystem.model.Coach;



@Repository
public interface CoachDAOInterface extends JpaRepository<Coach, Integer>{
	
	
}
