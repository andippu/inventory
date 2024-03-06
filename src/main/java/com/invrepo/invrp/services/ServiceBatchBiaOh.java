package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.BatchBahanKemas;
import com.invrepo.invrp.models.BatchBiaOh;
import com.invrepo.invrp.repository.IBatchBiaOh;

@Service
public class ServiceBatchBiaOh {
	
	@Autowired
	IBatchBiaOh RepoSbbo;
	public List<BatchBiaOh> getBiaOhAll(){
		return RepoSbbo.findAll();
	}

}
