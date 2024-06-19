package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.DetilTtbbeli;
import com.invrepo.invrp.repository.IDetilTtbbeli;

@Service
public class ServiceDetilTtbbeli {
	
	@Autowired
	IDetilTtbbeli RepoDtlTtbbeli;
	
	public List<DetilTtbbeli> getDtlBeliNo(String belino){
		return RepoDtlTtbbeli.findBydtlttbbeliNo(belino);
	}
	
	public DetilTtbbeli getDtlBeliNoSingle(String belino,String code){
		return RepoDtlTtbbeli.findBydtlttbbeliNoAndDtlttbbahancode(belino, code);
	}
	
	public String saveUpdateDtlTtbbeli(DetilTtbbeli dtlttbeli){
		RepoDtlTtbbeli.save(dtlttbeli);
		return "Submit Successfully";
	}
	
	public String UpdateDtlTtbbeli (String dtlbelino, String dtlbahancode, String dtljnsbahan, String dtlbelijumlah, 
			String ttbharga,String ttbgrandtotal, String createby,String cretedate, String Pdtlbelino, String pdtlbahancode) {
		RepoDtlTtbbeli.updateWithTtbelinoAndBhnCode(dtlbelino, dtlbahancode, dtljnsbahan, dtlbelijumlah, ttbharga, ttbgrandtotal, createby, cretedate, Pdtlbelino, pdtlbahancode);
		return "Update Successfully";
	};

}
