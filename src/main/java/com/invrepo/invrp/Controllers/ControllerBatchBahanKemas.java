package com.invrepo.invrp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.BatchBahanKemas;
import com.invrepo.invrp.services.ServiceBatchBahanKemas;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBatchBahanKemas {
	
	@Autowired
	ServiceBatchBahanKemas ServSbbk;
	
	@GetMapping("/bahankemas/getbahankemasall")
	public List<BatchBahanKemas> getBahankemas(){
		//System.out.println("testbbbb");
        return ServSbbk.getBahanKemasAll();
    }
	
	@GetMapping("/bahankemas/getmbklistDay")
	public List<BatchBahanKemas> getBatchKemasListDay(String day){
		return ServSbbk.getBatchKemasByDay(day);
	}
	
	@GetMapping("/bahankemas/getmbklistMonth")
	public List<BatchBahanKemas> getBatchKemasListMonth(String month){
		return ServSbbk.getBatchKemasByMonth(month);
	}
	
	@GetMapping("/bahankemas/getmbknobatch")
	public List<BatchBahanKemas> getMbkNoBatch(String nobatch) {
		return ServSbbk.getMbkNoBatch(nobatch);
	}
	
	@GetMapping("/bahankemas/getmbknobatchsingle")
	public BatchBahanKemas getMbkNoBatchSingle (String nobatch, String code){
		return ServSbbk.getMbkNoBatchSingle(nobatch, code);
	}
	
}
