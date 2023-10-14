package com.Farming.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Farming.Repository.EquipmentRepository;
import com.Farming.Service.EquipmentService;
import com.Farming.entities.Equipment;

@Service
public class EquipmentServiceImpl implements EquipmentService {
	@Autowired
	EquipmentRepository er;

	public Equipment addEquipment(Equipment equipment) {
		return er.save(equipment);
	}

	public List<Equipment> viewAllEquipment() {
		List<Equipment> e = er.findAll();
		return e;
	}

	public Equipment updateEquipment(int id, Equipment euipment) {
		Equipment e = new Equipment();
		e.setEqid(euipment.getEqid());
		e.setName(euipment.getName());
		e.setType(euipment.getType());

		return er.save(e);
	}

	public String deleteequipmentById(int id) {
		er.deleteById(id);
		return "Equipment is deleted";
	}

	public String deleteAllequipment() {
		er.deleteAll();
		return " all Equipment are deleted";
	}

	public Equipment viewequipmentById(int id) {
		Equipment e = er.findById(id).get();
		return e;
	}

}
