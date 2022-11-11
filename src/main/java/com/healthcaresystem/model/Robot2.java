package com.healthcaresystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RobotCoach")
public class Robot2 {
	@Id
	public int RobotIdCoach;
	private String coachFirstName;
	private String coachLastName; 
	private int exprienceInYears;
	
	
	public Robot2(int RobotIdCoach,String coachFirstName, String coachLastName, int exprienceInYears) {
	         super();
		this.RobotIdCoach=RobotIdCoach;
		this.coachFirstName = coachFirstName;
		this.coachLastName = coachLastName;
		this.exprienceInYears = exprienceInYears;
	}
	public Robot2() {
		super();
	}
	public int getRobotIdCoach() {
		return RobotIdCoach;
	}
	public void setRobotIdCoach(int robotIdCoach) {
		RobotIdCoach = robotIdCoach;
	}
	public String getCoachFirstName() {
		return coachFirstName;
	}
	
	public void setCoachFirstName(String coachFirstName) {
		this.coachFirstName = coachFirstName;
	}
	public String getCoachLastName() {
		return coachLastName;
	}
	public void setCoachLastName(String coachLastName) {
		this.coachLastName = coachLastName;
	}
	public int getExprienceInYears() {
		return exprienceInYears;
	}
	public void setExprienceInYears(int exprienceInYears) {
		this.exprienceInYears = exprienceInYears;
	}
	
}
