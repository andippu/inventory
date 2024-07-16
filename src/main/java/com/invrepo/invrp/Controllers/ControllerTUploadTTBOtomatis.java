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

import com.invrepo.invrp.models.TUploadTTBOtomatis;
import com.invrepo.invrp.repository.ITUploadTTBOtomatis;
import com.invrepo.invrp.services.ServiceTUploadTTBOtomatis;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadTTBOtomatis {
	@Autowired
	ServiceTUploadTTBOtomatis servttb;
	
	@GetMapping("/tupttb/ttbotoList")
	public List<TUploadTTBOtomatis> getTtbOtoList(){
		return servttb.getTtbOtoList();
	}
	
	@GetMapping("/tupttb/terimacsvttblist")
	public String getTUpTerimaCsvNonProdList(){
		return servttb.exeTtbGetCsv();
	}
	
	@GetMapping("/tupttb/prosesttb")
	public String getTUpPProsesNonProd(){
		return servttb.exeProsesTtb();
	}
	
	

}
