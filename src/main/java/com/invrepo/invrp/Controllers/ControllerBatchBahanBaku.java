package com.invrepo.invrp.Controllers;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/bahanbaku/getmbblistDay")
	public List<BatchBahanBaku> getBatchBakuListDay(String day){
		return ServSBBBaku.getBatchBakuByDay(day);
	}
	
	@GetMapping("/bahanbaku/getmbblistMonth")
	public List<BatchBahanBaku> getBatchBakuListMonth(String month){
		return ServSBBBaku.getBatchBakuByMonth(month);
	}
	
	@GetMapping("/bahanbaku/getmbbnobat")
	public List<BatchBahanBaku> getMbbNoBatch(String nobatch){
		return ServSBBBaku.getMbbNoBatch(nobatch);
	}
	
	@GetMapping("/bahanbaku/getmbbnobatsingle")
    public  BatchBahanBaku getMbbNoBatchSingle(String nobatch, String code){
        return ServSBBBaku.getMbbNoBatchSingle(nobatch, code);
    }

}
