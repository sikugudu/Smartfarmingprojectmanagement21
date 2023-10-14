package com.Farming.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.entities.Pesticides;



public interface PesticidesRepository extends JpaRepository<Pesticides,Integer> { 

}

