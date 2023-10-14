package com.Farming.Service;

import java.util.List;

import com.Farming.entities.MaintenanceLog;

public interface MaintenanceLogService {
	MaintenanceLog addMaintenanceLog(MaintenanceLog MaintenanceLog);

	List<MaintenanceLog> viewAllMaintenanceLog();

	MaintenanceLog viewMaintenanceLogById(int id);

	MaintenanceLog updateMaintenanceLog(int id, MaintenanceLog MaintenanceLog);

	String deleteMaintenanceLogById(int id);

	String deleteAllMaintenanceLog();

}
