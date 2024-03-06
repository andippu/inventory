package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.BatchBahanBaku;
import com.invrepo.invrp.services.ServiceBatchBahanBaku;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBatchBahanBaku {
	
	@Autowired
	ServiceBatchBahanBaku ServSBBBaku;
	
	@GetMapping("/bahanbaku/getbahanbakuall")
	public List<BatchBahanBaku> getBahanBaku(){
		//System.out.println("testbbbb");
        return ServSBBBaku.getBahanBakuAll();
    }

}
