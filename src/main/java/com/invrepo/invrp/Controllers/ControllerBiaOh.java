package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.BatchBiaOh;
import com.invrepo.invrp.services.ServiceBatchBiaOh;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBiaOh {
	
	@Autowired
	ServiceBatchBiaOh ServSbbo;
	
	@GetMapping("/biaoh/getbiaohall")
	public List<BatchBiaOh> getBiaOh(){
		//System.out.println("testbbbb");
        return ServSbbo.getBiaOhAll();
    }
	
	@GetMapping("/biaoh/getbiaohlistDay")
	public List<BatchBiaOh> getBatchOhListDay(String day){
		return ServSbbo.getBatchOhByDay(day);
	}
	
	@GetMapping("/biaoh/getbiaohlistmonth")
	public List<BatchBiaOh> getBatchOhListMonth(String month){
		return ServSbbo.getBatchOhByMonth(month);
	}
	
	@GetMapping("/biaoh/getbiaohnobatch")
	public List<BatchBiaOh> getBbohNoBatch(String nobatch){
		return ServSbbo.getBbohNoBatch(nobatch);
	}
	
	@GetMapping("/biaoh/getbiaohnobatchsingle")
	public BatchBiaOh getBbohNoBatchSingle(String nobatch, Integer seq){
		return ServSbbo.getBbohNoBatchSingle(nobatch, seq);
	}

}
