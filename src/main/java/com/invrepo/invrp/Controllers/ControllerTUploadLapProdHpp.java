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

import com.invrepo.invrp.models.TUploadLapProdHpp;
import com.invrepo.invrp.services.ServiceTUploadLapProdHpp;



@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadLapProdHpp {
	@Autowired
	ServiceTUploadLapProdHpp servLPH;
	
	@GetMapping("/tulph/terimacsvlph")
	public String exeLapProdHppGetCsv() {
		return servLPH.exeLapProdHppGetCsv();
	}
	
	@GetMapping("/tulph/getlphlist")
	public List<TUploadLapProdHpp> getLapProdHppList(){
		return servLPH.getLapProdHppList();
	}
	
	

}
