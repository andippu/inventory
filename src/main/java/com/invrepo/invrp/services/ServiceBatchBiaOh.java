package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.BatchBiaOh;
import com.invrepo.invrp.repository.IBatchBiaOh;

@Service
public class ServiceBatchBiaOh {
	
	@Autowired
	IBatchBiaOh RepoSbbo;
	
	public List<BatchBiaOh> getBiaOhAll(){
		return RepoSbbo.findAll();
	}
	
	public List<BatchBiaOh> getBatchOhByDay(String day){
	       // System.out.println("test dt :"+dt);
	          return RepoSbbo.getMboByDay(day);
	}
	
	public List<BatchBiaOh> getBatchOhByMonth(String month){
	       // System.out.println("test dt :"+dt);
	          return RepoSbbo.getMboByMonth(month);
	}
	
	public List<BatchBiaOh> getBbohNoBatch(String nobatch){
		return RepoSbbo.findByBbohMbtNoBatch(nobatch);		
	}
	
	public BatchBiaOh getBbohNoBatchSingle(String nobatch,Integer seq){
		return RepoSbbo.findByBbohMbtNoBatchAndBbohSeq(nobatch, seq);		
	}
	

}
