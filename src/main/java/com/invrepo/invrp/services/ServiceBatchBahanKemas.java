package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.BatchBahanBaku;
import com.invrepo.invrp.models.BatchBahanKemas;
import com.invrepo.invrp.repository.IBatchBahanKemas;

@Service
public class ServiceBatchBahanKemas {
	
	@Autowired
	IBatchBahanKemas RepoSbbk;
	
	public List<BatchBahanKemas> getBahanKemasAll(){
		return RepoSbbk.findAll();
	}
	
	public List<BatchBahanKemas> getBatchKemasByDay(String day){
       // System.out.println("test dt :"+dt);
          return RepoSbbk.getMbkByDay(day);
    }
	
	public List<BatchBahanKemas> getBatchKemasByMonth(String month){
	       // System.out.println("test dt :"+dt);
	          return RepoSbbk.getMbkByMonth(month);
	}
	
	public List<BatchBahanKemas> getMbkNoBatch(String nobatch){
	       // System.out.println("test dt :"+dt);
	          return RepoSbbk.findByBbkMbtNoBatch(nobatch);
	}
	
	public  BatchBahanKemas getMbkNoBatchSingle(String nobatch, String code){
        return RepoSbbk.findByBbkMbtNoBatchAndBbkBkCode(nobatch, code);
    }
	

}
