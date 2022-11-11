package com.healthcaresystem.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coach")
public class Coach {
	@Id
	int coachId; 
	private String firstName; 
	private String lastName; 
	private int exprienceInYears;
	private String certification;
	private int totalTransformations;
	
	
	public int getCoachId() {
		return coachId;
	}

	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getExprienceInYears() {
		return exprienceInYears;
	}

	public void setExprienceInYears(int exprienceInYears) {
		this.exprienceInYears = exprienceInYears;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public int getTotalTransformations() {
		return totalTransformations;
	}

	public void setTotalTransformations(int totalTransformations) {
		this.totalTransformations = totalTransformations;
	}

	public Coach( String firstName, String lastName, int exprienceInYears, String certification,
			int totalTransformations) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.exprienceInYears = exprienceInYears;
		this.certification = certification;
		this.totalTransformations = totalTransformations;
		
	}
	

	public Coach() {
		
	}
	
	
}
