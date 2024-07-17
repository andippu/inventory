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

import com.invrepo.invrp.models.TUploadValProdJadiHo;
import com.invrepo.invrp.services.ServiceTUploadValProdJadiHo;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadValProdJadiHo {
	@Autowired
	ServiceTUploadValProdJadiHo servvpj;
	
	@GetMapping("/tuvpj/terimacsvalvpj")
	public String exeValProdJadiGetCsv() {
		return servvpj.exeValProdJadiGetCsv();
	}
	
	@GetMapping("/tuvpj/getvpjlist")
	public List<TUploadValProdJadiHo> getValVPJList(){
		return servvpj.getValVPJList();
	}
}
