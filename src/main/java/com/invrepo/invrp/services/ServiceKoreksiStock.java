package com.invrepo.invrp.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.KoreksiStock;
import com.invrepo.invrp.repository.IKoreksiStockRepository;


@Service

public class ServiceKoreksiStock {
	@Autowired
	IKoreksiStockRepository repoKS;
	
	public List<KoreksiStock> getKoreksiStock(Date pdate){
		return repoKS.findByKsDate(pdate);
	}
	
	
	public List<KoreksiStock> getKoreksiStockCU (BigDecimal ksid){
		return repoKS.findByKsId(ksid);
	}
	
	public String saveUpdKoreksiStock (KoreksiStock ks) {
		repoKS.save(ks);
		return "Submit Successfully";
	}
	
}
