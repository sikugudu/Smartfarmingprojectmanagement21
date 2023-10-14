package com.Farming.Service;

import java.util.List;

import com.Farming.entities.Equipment;

public interface EquipmentService {
	public Equipment addEquipment(Equipment equipment);

	public List<Equipment> viewAllEquipment();

	public Equipment updateEquipment(int id, Equipment euipment);

	public String deleteequipmentById(int id);

	public String deleteAllequipment();

	public Equipment viewequipmentById(int id);

}
