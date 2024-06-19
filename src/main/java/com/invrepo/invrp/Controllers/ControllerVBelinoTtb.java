package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.VBelinoTtb;
import com.invrepo.invrp.services.ServiceVBelinoTtb;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVBelinoTtb {
	
	@Autowired
	ServiceVBelinoTtb ServBelinoTtb;
	
	@GetMapping("/vbelino/getbelinotgl")
	public List<VBelinoTtb> getBelinoTgl(String month){
        return ServBelinoTtb.getBelinoTgl(month);
    }

}
