package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.invrepo.invrp.models.TUploadValProdJadiHo;
import com.invrepo.invrp.repository.ITUploadValProdJadiHo;

@Service
public class ServiceTUploadValProdJadiHo {
	@Autowired
	ITUploadValProdJadiHo repotuvpj;
	
	public String exeValProdJadiGetCsv() {
		return repotuvpj.exeValProdJadiHOGetCsv();
	}
	
	public List<TUploadValProdJadiHo> getValVPJList(){
		return repotuvpj.findAll();
	}
	

}
