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

import com.invrepo.invrp.models.TransBahan;
import com.invrepo.invrp.services.ServiceTransBahan;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTransBahan {
	
	@Autowired
	ServiceTransBahan ServTransBahan;
	
	@GetMapping("/transbahan/getbytbtype")
	public List<TransBahan> getByTbType(String type){
        return ServTransBahan.getTbType(type);
    }
	
	@GetMapping("/transbahan/getbytbid")
	public Optional<TransBahan> getByTbId(Integer tbid) {
		return ServTransBahan.gettrTbId(tbid);
	}
	
	@PostMapping("/transbahan/savetransbahan")
	public String saveUpdateTransBahan(@RequestBody TransBahan transbahan ) {
		return ServTransBahan.saveUpdateTransBahan(transbahan);
	
	}
	
	@DeleteMapping("/transbahan/deletetransbahan")
	public String DelTransBahan(Integer tbid) {
		return ServTransBahan.DelTransBahanById(tbid);
	
	}

}
