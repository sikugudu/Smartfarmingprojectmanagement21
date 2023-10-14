package com.Farming.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class MaintenanceLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int logid;
	Date maintenanceDate;
	String description;
	String cost;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "e_id", referencedColumnName = "eqid")
	public Equipment equipment;
	

	public int getLogid() {
		return logid;
	}

	public void setLogid(int logid) {
		this.logid = logid;
	}

	public Date getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	
}
