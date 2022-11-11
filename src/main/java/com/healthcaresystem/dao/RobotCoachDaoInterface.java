package com.healthcaresystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.healthcaresystem.model.Robot2;


@Repository
public interface RobotCoachDaoInterface extends JpaRepository<Robot2,Integer> {



	

}