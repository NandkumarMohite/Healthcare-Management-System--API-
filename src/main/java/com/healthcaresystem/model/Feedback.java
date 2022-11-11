package com.healthcaresystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Feedback")
public class Feedback {
	 @Id
	 int id;
	private String overallExprinence;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String userName;
	private String planYouAssigned;
	private String yourMassage;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Feedback() {
		super();
	}
	public Feedback(String userName,String overallExprinence, String planYouAssigned, String yourMassage) {
		super();
		
		
		this.userName = userName;
		this.overallExprinence=overallExprinence;
		this.planYouAssigned = planYouAssigned;
		this.yourMassage = yourMassage;
	}
	public String getPlanYouAssigned() {
		return planYouAssigned;
	}
	public void setPlanYouAssigned(String planYouAssigned) {
		this.planYouAssigned = planYouAssigned;
	}
	public String getYourMassage() {
		return yourMassage;
	}
	public void setYourMassage(String yourMassage) {
		this.yourMassage = yourMassage;
	}
	public String getOverallExprinence() {
		return overallExprinence;
	}
	public void setOverallExprinence(String overallExprinence) {
		this.overallExprinence = overallExprinence;
	}

}
