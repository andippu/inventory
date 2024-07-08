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
		String temp=repotupp.exeTuppGetCsv();
		System.out.println("temp :"+temp);
		return repotupp.findAll();
	}
	
	 public void checkTTupp() {
	        List<TUploadPenerimaanProduksi> tup = repotupp.findAll(); // You can use findBy<YourField> if needed

	        if (!tup.isEmpty()) {
	        	repotupp.deleteAll();
	            System.out.println("Data deleted successfully");
	        } else {
	            System.out.println("No data found in the table");
	        }
	  }
	 
	 public String insTUpPbOto (TUploadPenerimaanProduksi data){
		 repotupp.save(data);
		 repotupp.flush();
		 
	       return "Upload CSV Success";
	}
	
	

}
