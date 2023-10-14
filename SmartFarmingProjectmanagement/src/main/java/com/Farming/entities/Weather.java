package com.Farming.entities;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Weather {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int DataId;
	int Timestamp;
	String precipitation;
	String windSpeed;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "p_id", referencedColumnName = "pesticideId")
	public Pesticides pesticides;
	
	public int getDataId() {
		return DataId;
	}
	public void setDataId(int dataId) {
		DataId = dataId;
	}
	public int getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(int timestamp) {
		Timestamp = timestamp;
	}
	
	public String getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
}
	