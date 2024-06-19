package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

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
	
	public List<MasterBatch> getMasterBatchByDay(String day){
       // System.out.println("test dt :"+dt);
          return repoMbt.getMbtByDay(day);
    }
	
	public List<MasterBatch> getMasterBatchByMonth(String month){
	       // System.out.println("test dt :"+dt);
	          return repoMbt.getMbtByMonth(month);
	}
	
	public Optional<MasterBatch> getNoBatch(String nobatch) {
		return repoMbt.findByMbtNoBatch(nobatch);
	}
	
	public String saveUpdateMasterBatch(MasterBatch mstbatch) {
		repoMbt.save(mstbatch);
		return "Submit Successfully";
	}
	
}
