package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.BatchBahanKemas;
import com.invrepo.invrp.repository.IBatchBahanKemas;

@Service
public class ServiceBatchBahanKemas {
	
	@Autowired
	IBatchBahanKemas RepoSbbk;
	public List<BatchBahanKemas> getBahanKemasAll(){
		return RepoSbbk.findAll();
	}

}
