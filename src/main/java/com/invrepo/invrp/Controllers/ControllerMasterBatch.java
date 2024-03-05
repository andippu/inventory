package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.MasterBatch;
import com.invrepo.invrp.services.ServiceMasterBatch;



@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerMasterBatch {
	@Autowired
	ServiceMasterBatch servMbt;
	
	@GetMapping("/mbat/getmbtlist")
	public List<MasterBatch> getMasterBatchList(){
		return servMbt.getMasterBatchList();
	}
	
	@GetMapping("/mbat/gettest")
	public String gettestt(){
		return "testing 123";
	}

}
