package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.DetilTtbbeli;
import com.invrepo.invrp.services.ServiceDetilTtbbeli;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerDetilTtbbeli {
	
	@Autowired
	ServiceDetilTtbbeli ServTtbbeli;
	
	@GetMapping("/dtlTtbbeli/getdtlbelino")
	public List<DetilTtbbeli> getDtlBeliNo(String belino){
        return ServTtbbeli.getDtlBeliNo(belino);
    }
	
	@GetMapping("/dtlTtbbeli/getdtlbelinosingle")
	public DetilTtbbeli getDtlBeliNoSingle(String belino,String code){
        return ServTtbbeli.getDtlBeliNoSingle(belino, code);
    }
	
	@PostMapping("/dtlTtbbeli/saveupdatettbeli")
	public String SaveUpdateTtbbeli(@RequestBody DetilTtbbeli dtlttbeli){
        return ServTtbbeli.saveUpdateDtlTtbbeli(dtlttbeli);
    }
	
	@GetMapping("/dtlTtbbeli/updatedtlttbbeli")
	public String UpdateDetilTtbbeli (String dtlbelino, String dtlbahancode, String dtljnsbahan, String dtlbelijumlah, 
			String ttbharga,String ttbgrandtotal, String createby,String cretedate, String Pdtlbelino, String pdtlbahancode){
		ServTtbbeli.UpdateDtlTtbbeli(dtlbelino, dtlbahancode, dtljnsbahan, dtlbelijumlah, ttbharga, ttbgrandtotal, createby, cretedate, Pdtlbelino, pdtlbahancode);
		return "Update Successfully";
	}

}
