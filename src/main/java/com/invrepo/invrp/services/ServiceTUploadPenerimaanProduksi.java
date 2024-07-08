package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.TUploadPenerimaanProduksi;
import com.invrepo.invrp.repository.ITUploadPenerimaanProduksi;

@Service
public class ServiceTUploadPenerimaanProduksi {
	@Autowired
	ITUploadPenerimaanProduksi repotupp;
	
	public List<TUploadPenerimaanProduksi> getTUpTerimaProdList(){
		return repotupp.findAll();
	}
	
	

}
