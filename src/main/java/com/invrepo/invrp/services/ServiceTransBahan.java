package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.TransBahan;
import com.invrepo.invrp.repository.ITransBahan;

@Service
public class ServiceTransBahan {
	
	@Autowired
	ITransBahan RepoTransBahan;
	
	public List<TransBahan> getTbType(String type){
	       return RepoTransBahan.getByTbType(type);
	}
	
	public Optional<TransBahan> gettrTbId(Integer tbid){
	       return RepoTransBahan.findBytrTbId(tbid);
	}
	
	public String saveUpdateTransBahan(TransBahan transbahan) {
		   RepoTransBahan.save(transbahan);
		   return "Submit Successfully";
	}
	
	public String DelTransBahanById(Integer tbid) {
		   RepoTransBahan.deleteById(tbid);
		   return "Delete Successfully";
	}

}
