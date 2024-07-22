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

import com.invrepo.invrp.models.TuploadTransaksiBarang;
import com.invrepo.invrp.services.ServiceTuploadTransaksiBarang;




@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTuploadTransaksiBarang {
	@Autowired
	ServiceTuploadTransaksiBarang servTB;
	
	@GetMapping("/tutrbr/trbrlist")
	public List<TuploadTransaksiBarang> getTransBrgList(){
		return servTB.getTransBrgList();
	}
	
	@GetMapping("/tutrbr/terimacsvtb1")
	public String exeTB1BpHpCsv() {
		return servTB.exeTB1BpHpCsv();
	}
	
	@GetMapping("/tutrbr/terimacsvtb2")
	public String exeTB2SpbSelainCsv() {
		return servTB.exeTB2SpbSelainCsv();
	}
	
	@GetMapping("/tutrbr/terimatransBarang")
	public String exeProcessTransBrg(String rt, String tipe , String stat) {
		return servTB.exeProcessTransBrg(rt, tipe, stat);
	}

}
