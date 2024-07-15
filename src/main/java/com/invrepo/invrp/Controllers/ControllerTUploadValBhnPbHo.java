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

import com.invrepo.invrp.models.TUploadValBhnPbHo;
import com.invrepo.invrp.services.ServiceTUploadValBhnPbHo;


@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadValBhnPbHo {
	@Autowired
	ServiceTUploadValBhnPbHo servtuvbph;
	
	@GetMapping("/tuvbph/getvalbhnpbrkholist")
	public List<TUploadValBhnPbHo> getValBhnPbrkHo(){
		return servtuvbph.getValBhnPbrkHoList();
	}
	
	@GetMapping("/tuvbph/terimacsvalbhnpbrkho")
	public String exeValBhnPbHoGetCsv() {
		return servtuvbph.exeValBhnPbHoGetCsv();
	}

}
