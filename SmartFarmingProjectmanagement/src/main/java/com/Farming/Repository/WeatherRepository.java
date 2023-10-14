package com.Farming.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.entities.Weather;





public interface WeatherRepository extends JpaRepository<Weather,Integer>{
	
}

