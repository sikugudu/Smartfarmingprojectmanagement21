package com.Farming.Service;

import java.util.List;

import com.Farming.entities.Farmer;

public interface FarmerService {
	Farmer addfarmers(Farmer farmer);

	List<Farmer> viewAllFarmer();

	Farmer viewfarmerById(int id);

	Farmer updatefarmer(int id, Farmer farmer);

	String deletefarmerById(int id);

	String deleteAllfarmer();

}
