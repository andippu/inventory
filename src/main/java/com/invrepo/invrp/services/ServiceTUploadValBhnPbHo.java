package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.invrepo.invrp.models.TUploadValBhnPbHo;
import com.invrepo.invrp.repository.ITUploadValBhnPbHo;


@Service
public class ServiceTUploadValBhnPbHo {
	@Autowired
	ITUploadValBhnPbHo repotuvbph;
	
	public List<TUploadValBhnPbHo> getValBhnPbrkHoList(){
		return repotuvbph.findAll();
	}
	
	public String exeValBhnPbHoGetCsv() {
		return repotuvbph.exeValBhnPbHoGetCsv();
	}

}
