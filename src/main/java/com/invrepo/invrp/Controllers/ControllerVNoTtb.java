package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.VBelinoTtb;
import com.invrepo.invrp.models.VNoTtb;
import com.invrepo.invrp.services.ServiceVBelinoTtb;
import com.invrepo.invrp.services.ServiceVNoTtb;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVNoTtb {
	
	@Autowired
	ServiceVNoTtb ServVNoTtb;
	
	@GetMapping("/vnottb/getvttbbelitgl")
	public List<VNoTtb> getTtbbeliTgl(String month){
        return ServVNoTtb.getTtbbeliTgl(month);
    }

}
