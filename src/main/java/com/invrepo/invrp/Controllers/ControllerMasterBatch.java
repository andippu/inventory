package com.invrepo.invrp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/mbat/getmbtlistDay")
	public List<MasterBatch> getMasterBatchListDay(String day){
		return servMbt.getMasterBatchByDay(day);
	}
	
	@GetMapping("/mbat/getmbtlistMonth")
	public List<MasterBatch> getMasterBatchListMonth(String month){
		return servMbt.getMasterBatchByMonth(month);
	}
	
	@GetMapping("/mbat/getmbtnobatch")
	public Optional<MasterBatch> getMbtNoBatch(String nobatch) {
		return servMbt.getNoBatch(nobatch);
	}
	
	@PostMapping("/mbat/saveupdmstbatch")
	public String saveUpdateMasterBatch(@RequestBody MasterBatch mstbatch) {
		return servMbt.saveUpdateMasterBatch(mstbatch);
	
	}
	
	@GetMapping("/mbat/gettest")
	public String gettestt(){
		return "testing 123";
	}

}
