package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.VBelinoTtb;
import com.invrepo.invrp.repository.IVBelinoTtb;

@Service
public class ServiceVBelinoTtb {
	
	@Autowired
	IVBelinoTtb RepoBelinoTtb;
	
	public List<VBelinoTtb> getBelinoTgl(String month){
	       return RepoBelinoTtb.getByTtbbeliTgl(month);
	}

}
