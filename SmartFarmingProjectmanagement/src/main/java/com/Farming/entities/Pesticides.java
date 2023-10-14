package com.Farming.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Pesticides {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pesticideId;
	String pesticideName;
	int ApplicationDate;
	
	
	public int getPesticideId() {
		return pesticideId;
	}
	public void setPesticideId(int pesticideId) {
		this.pesticideId = pesticideId;
	}
	public String getPesticideName() {
		return pesticideName;
	}
	public void setPesticideName(String pesticideName) {
		this.pesticideName = pesticideName;
	}
	public int getApplicationDate() {
		return ApplicationDate;
	}
	public void setApplicationDate(int applicationDate) {
		ApplicationDate = applicationDate;
	}
	
	}
	
	
	
