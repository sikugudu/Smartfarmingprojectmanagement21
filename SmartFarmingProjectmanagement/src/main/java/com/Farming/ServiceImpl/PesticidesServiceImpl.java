package com.Farming.ServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Farming.Repository.PesticidesRepository;
import com.Farming.Service.pesticidesService;
import com.Farming.entities.Pesticides;


@Service
public class PesticidesServiceImpl implements pesticidesService{
	@Autowired
	PesticidesRepository pr;

	@Override
	public Pesticides addPesticides(Pesticides pesticides) {
		return pr.save(pesticides);
	}

	@Override
	public List<Pesticides> viewAllPesticides() {
		List<Pesticides> p=pr.findAll();
		return p;
	}

	@Override
	public Pesticides updatepesticides(int id, Pesticides pesticides) {
		Pesticides p=new Pesticides();
		p.setPesticideId(pesticides.getPesticideId());
		p.setPesticideName(pesticides.getPesticideName());
		p.setApplicationDate(pesticides.getApplicationDate());
		return pr.save(p);
	}

	@Override
	public String deletepesticidesById(int id) {
		pr.deleteById(id);
		return "Pesticides is deleted";
	}

	@Override
	public String deleteAllpesticides() {
		pr.deleteAll();
		return "all pesticides are deleted";
	}

	@Override
	public Pesticides viewpesticidesById(int id) {
		Pesticides p=pr.findById(id).get();
		return p;
	}

}
