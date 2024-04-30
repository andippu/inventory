package com.invrepo.invrp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.MasterBatch;
import com.invrepo.invrp.models.Produksi;
import com.invrepo.invrp.services.ServiceProduksi;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerProduksi {
	
	@Autowired
	ServiceProduksi ServProd;
	
	@GetMapping("/prod/getprodall")
	public List<Produksi> getProd(){
		//System.out.println("testbbbb");
        return ServProd.getProdAll();
    }
	
	@GetMapping("/prod/getprodbyday")
	public List<Produksi> getProdByDay(String day){
        return ServProd.getProdByDay(day);
    }
	
	@GetMapping("/prod/getprodbymonth")
	public List<Produksi> getProdByMonth(String month){
        return ServProd.getProdByMonth(month);
    }
	
	@GetMapping("/prod/getprodbynobatchmonth")
	public List<Produksi> getProdByMonth(String month, String nobatch){
        return ServProd.getProdByNoBatchMonth(month, nobatch);
    }
	
	@GetMapping("/prod/getprodnourut")
	public Optional<Produksi> getPrNoBatch(Integer nourut) {
		return ServProd.getProdNoUrut(nourut);
	}
	
	@PostMapping("/prod/saveupdprod")
	public String saveUpdateProduksi(@RequestBody Produksi prod) {
		return ServProd.saveUpdateProduksi(prod);
	
	}

}
