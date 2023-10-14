package com.Farming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.entities.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer> {

}
