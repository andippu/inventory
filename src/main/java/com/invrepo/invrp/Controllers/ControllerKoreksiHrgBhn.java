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

import com.invrepo.invrp.models.KoreksiHargaBahan;
import com.invrepo.invrp.services.ServiceKoreksiHrgBhn;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerKoreksiHrgBhn {
	@Autowired
	ServiceKoreksiHrgBhn servKBH;
	
	@GetMapping("/khrgbhn/kbhList")
	public List<KoreksiHargaBahan> getKoreksiHrgBahan(String pdate){
		return servKBH.getKoreksiHrgBahan(pdate);
	}
    
	@GetMapping("/khrgbhn/kbhcu")
	public List<KoreksiHargaBahan> getKoreksiHrgBahanCU(BigDecimal ksid){
		return servKBH.getKoreksiHrgBahanCU(ksid);
	}
	
	 @PostMapping("/khrgbhn/saveupdkorhrgbhn")
	public String saveUpdKoreksiHrgBhn(@RequestBody KoreksiHargaBahan kbh) {		
		return servKBH.saveUpdKoreksiHrgBhn(kbh);
	}

}
