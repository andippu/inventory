package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.VNoTtb;
import com.invrepo.invrp.repository.IVNoTtb;

@Service
public class ServiceVNoTtb {
	
	@Autowired
	IVNoTtb RepovnoTtb;
	
	public List<VNoTtb> getTtbbeliTgl(String month){
	       return RepovnoTtb.getByTtbaTgl(month);
	}

}
