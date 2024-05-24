package com.invrepo.invrp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.MasterTtbbeli;
import com.invrepo.invrp.models.Produksi;
import com.invrepo.invrp.services.ServiceMasterTtbbeli;
import com.invrepo.invrp.services.ServiceProduksi;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerMasterTtbbelino {
	
	@Autowired
	ServiceMasterTtbbeli ServMasbel;
	
	@GetMapping("/masbel/getmasbelall")
	public List<MasterTtbbeli> getMasBel(){
		//System.out.println("testbbbb");
        return ServMasbel.getMasBelAll();
    }
	
	@GetMapping("/masbel/getmasbelbyday")
	public List<MasterTtbbeli> getMasBelByDay(String day){
        return ServMasbel.getMasBelByDay(day);
    }
	
	@GetMapping("/masbel/getmasbelbymonth")
	public List<MasterTtbbeli> getMasBelByMonth(String month){
        return ServMasbel.getMasBelByBeliNoMonth(month, month);
    }
	
	@GetMapping("/masbel/getmasbelbybelinomonth")
	public List<MasterTtbbeli> getMasBelByMonth(String month, String belino){
        return ServMasbel.getMasBelByBeliNoMonth(month, belino);
    }
	
	@GetMapping("/masbel/getmasbelno")
	public Optional<MasterTtbbeli> getMasBelNo(String belino) {
		return ServMasbel.getBeliNo(belino);
	}
	
	@PostMapping("/masbel/saveupdmasbel")
	public String saveUpdateProduksi(@RequestBody MasterTtbbeli masbel) {
		return ServMasbel.saveUpdateMasterTtbbeli(masbel);
	
	}

}
