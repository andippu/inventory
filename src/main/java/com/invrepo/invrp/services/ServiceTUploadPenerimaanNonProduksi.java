package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.TUploadPenerimaanNonProduksi;
import com.invrepo.invrp.models.TUploadPenerimaanProduksi;
import com.invrepo.invrp.repository.ITUploadPenerimaanNonProduksi;
import com.invrepo.invrp.repository.ITUploadPenerimaanProduksi;

@Service
public class ServiceTUploadPenerimaanNonProduksi {
	@Autowired
	ITUploadPenerimaanNonProduksi repotupnp;
	
	public List<TUploadPenerimaanNonProduksi> getTUpTerimaNonProdList(){
		return repotupnp.findAll();
	}
	
	public String exeCsvNonProduksi() {
		return repotupnp.exeProsesCsvPNP();
	}
	
	

}
