package com.healthcaresystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.healthcaresystem.model.Robot;


@Repository
public interface RobotDaoInterface extends JpaRepository<Robot,Integer> {

}