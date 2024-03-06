package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.BatchBahanKemas;
import com.invrepo.invrp.models.Produksi;
import com.invrepo.invrp.repository.IProduksi;

@Service
public class ServiceProduksi {
	
	@Autowired
	IProduksi RepoProd;
	public List<Produksi> getProdAll(){
		return RepoProd.findAll();
	}

}
