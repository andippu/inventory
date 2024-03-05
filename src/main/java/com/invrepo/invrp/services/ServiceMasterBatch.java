package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.MasterBatch;
import com.invrepo.invrp.repository.IMasterBatch;



@Service
public class ServiceMasterBatch {

	@Autowired
	IMasterBatch repoMbt;
	

	public List<MasterBatch> getMasterBatchList(){
		return repoMbt.findAll();
	}
	
}
