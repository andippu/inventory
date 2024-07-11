package com.invrepo.invrp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.TUploadPenerimaanNonProduksi;
import com.invrepo.invrp.models.TUploadPenerimaanProduksi;
import com.invrepo.invrp.repository.ITUploadPenerimaanNonProduksi;
import com.invrepo.invrp.services.ServiceTUploadPenerimaanNonProduksi;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadPenerimaanNonProduksi {
	@Autowired
	ServiceTUploadPenerimaanNonProduksi servtupnp;
	
	@GetMapping("/tupnp/terimanonprodlist")
	public List<TUploadPenerimaanNonProduksi> getTUpTerimaNonProdList(){
		return servtupnp.getTUpTerimaNonProdList();
	}
	
	@GetMapping("/tupnp/terimacsvnonprodlist")
	public String getTUpTerimaCsvNonProdList(){
		return servtupnp.exeCsvNonProduksi();
	}
	
	@GetMapping("/tupnp/prosesnonprod")
	public String getTUpPProsesNonProdList(){
		return servtupnp.exepProsesNonProduksi();
	}
	
}
