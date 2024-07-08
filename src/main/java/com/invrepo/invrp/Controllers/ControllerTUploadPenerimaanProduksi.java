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

import com.invrepo.invrp.models.TUploadPenerimaanProduksi;
import com.invrepo.invrp.services.ServiceTUploadPenerimaanProduksi;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadPenerimaanProduksi {
	@Autowired
	ServiceTUploadPenerimaanProduksi servtupp;
	
	@GetMapping("/tupp/terimaprodlist")
	public List<TUploadPenerimaanProduksi> getTUpTerimaProduksi(){
		return servtupp.getTUpTerimaProdList();
	}
}
