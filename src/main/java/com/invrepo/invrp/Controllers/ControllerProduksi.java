package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.Produksi;
import com.invrepo.invrp.services.ServiceProduksi;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerProduksi {
	
	@Autowired
	ServiceProduksi ServProd;
	
	@GetMapping("/Prod/getprodall")
	public List<Produksi> getProd(){
		//System.out.println("testbbbb");
        return ServProd.getProdAll();
    }

}
