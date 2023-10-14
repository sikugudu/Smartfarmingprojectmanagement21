package com.Farming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.entities.MaintenanceLog;

public interface MaintenanceLogRepository extends JpaRepository<MaintenanceLog, Integer> {

	// MaintenanceLog save(MaintenanceLog maintenanceLog);
}
