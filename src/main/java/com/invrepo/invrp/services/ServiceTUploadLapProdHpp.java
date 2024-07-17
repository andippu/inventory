package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.invrepo.invrp.models.TUploadLapProdHpp;
import com.invrepo.invrp.repository.ITUploadLapProdHpp;

@Service
public class ServiceTUploadLapProdHpp {
	@Autowired
	ITUploadLapProdHpp repoLPH;
	
	public String exeLapProdHppGetCsv() {
		return repoLPH.exeLapProdHppGetCsv();
	}
	
	public List<TUploadLapProdHpp> getLapProdHppList(){
		return repoLPH.findAll();
	}
}
