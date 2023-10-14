package com.Farming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.entities.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

}
