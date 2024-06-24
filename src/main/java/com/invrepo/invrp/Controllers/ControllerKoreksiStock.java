package com.invrepo.invrp.Controllers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.KoreksiStock;
import com.invrepo.invrp.services.ServiceKoreksiStock;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerKoreksiStock {
	@Autowired
	ServiceKoreksiStock servKS;
	
	@GetMapping("/koreksiStock/ksList")
	public List<KoreksiStock> getKoreksiStock(String pdate){
		return servKS.getKoreksiStock(pdate);
	}
	
	@GetMapping("/koreksiStock/kscu")
	public List<KoreksiStock> getKoreksiStockCU (BigDecimal ksid){
		return servKS.getKoreksiStockCU(ksid);
	}
	
	@PostMapping("/koreksiStock/saveupdkorstrock")
	public String saveUpdKoreksiStock (@RequestBody KoreksiStock ks) {		
		return servKS.saveUpdKoreksiStock(ks);
	}
}
