package com.Farming.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Equipment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eqid;
	String name;
	String type;
	

	
	public int getEqid() {
		return eqid;
	}

	public void setEqid(int eqid) {
		this.eqid = eqid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
