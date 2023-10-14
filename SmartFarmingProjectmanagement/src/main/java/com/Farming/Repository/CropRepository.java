package com.Farming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.entities.Crop;

public interface CropRepository extends JpaRepository<Crop, Integer> {

}
