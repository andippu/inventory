package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.MasterBatch;
import com.invrepo.invrp.models.Produksi;
import com.invrepo.invrp.repository.IProduksi;

@Service
public class ServiceProduksi {
	
	@Autowired
	IProduksi RepoProd;
	
	public List<Produksi> getProdAll(){
		return RepoProd.findAll();
	}
	
	public List<Produksi> getProdByDay(String day){
	       // System.out.println("test dt :"+dt);
	          return RepoProd.getPrByDay(day);
	}
	
	public List<Produksi> getProdByMonth(String month){
	       // System.out.println("test dt :"+dt);
	          return RepoProd.getPrByMonth(month);
	}
	
	public Optional<Produksi> getProdNoUrut(Integer nourut){
	       // System.out.println("test dt :"+dt);
	          return RepoProd.findByPrNoUrut(nourut);
	}
	
	public String saveUpdateProduksi(Produksi prod) {
		RepoProd.save(prod);
		return "Submit Successfully";
	}

}
