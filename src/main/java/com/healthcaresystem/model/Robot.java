package com.healthcaresystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Robot")
public class Robot {
 

	
	@Id
	public int RobotId;
	private String userFirstName;
	private String userlastName;
	private String usserMailId;
	private String userMobileNumber;
	private String uplanType;	 
	private int uduration;
	private double ufee;
//	private String coachFirstName; 
//	private String coachLastName; 
//	private int exprienceInYears;
	
	public long getRobotId() {
		return RobotId;
	}
	public void setRobot(int RobotId) {
		this.RobotId = RobotId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserlastName() {
		return userlastName;
	}
	public void setUserlastName(String userlastName) {
		this.userlastName = userlastName;
	}
	public String getUsserMailId() {
		return usserMailId;
	}
	public void setUsserMailId(String usserMailId) {
		this.usserMailId = usserMailId;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	
	
	public Robot(int RobotId,String userFirstName, String userlastName, String usserMailId, String userMobileNumber,
			String uplanType, int uduration, double ufee) {
		
	    this.RobotId=RobotId;
		this.userFirstName = userFirstName;
		this.userlastName = userlastName;
		this.usserMailId = usserMailId;
		this.userMobileNumber = userMobileNumber;
		this.uplanType = uplanType;
		this.uduration = uduration;
		this.ufee = ufee;

		
	}
	public String getUplanType() {
		return uplanType;
	}
	public void setUplanType(String uplanType) {
		this.uplanType = uplanType;
	}
	public int getUduration() {
		return uduration;
	}
	public void setUduration(int uduration) {
		this.uduration = uduration;
	}
	public double getUfee() {
		return ufee;
	}
	public void setUfee(double ufee) {
		this.ufee = ufee;
	}
//	public String getCoachFirstName() {
//		return coachFirstName;
//	}
//	public void setCoachFirstName(String coachFirstName) {
//		this.coachFirstName = coachFirstName;
//	}
//	public String getCoachLastName() {
//		return coachLastName;
//	}
//	public void setCoachLastName(String coachLastName) {
//		this.coachLastName = coachLastName;
//	}
//	public int getExprienceInYears() {
//		return exprienceInYears;
//	}
//	public void setExprienceInYears(int exprienceInYears) {
//		this.exprienceInYears = exprienceInYears;
//	}
	
	public Robot() {
	
	}
}
