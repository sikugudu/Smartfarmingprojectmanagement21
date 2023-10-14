package com.Farming.Service;

import java.util.List;

import com.Farming.entities.Pesticides;





public interface pesticidesService {
	public Pesticides addPesticides(Pesticides pesticides); 

	 public  List<Pesticides> viewAllPesticides();
	
 

 public Pesticides updatepesticides( int id,Pesticides pesticides);

   public String  deletepesticidesById (int id) ;
   public String deleteAllpesticides();

	public Pesticides viewpesticidesById(int id);


}


