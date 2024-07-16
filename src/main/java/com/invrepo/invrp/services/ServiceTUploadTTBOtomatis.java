package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.invrepo.invrp.models.TUploadTTBOtomatis;
import com.invrepo.invrp.repository.ITUploadTTBOtomatis;


@Service
public class ServiceTUploadTTBOtomatis {
	@Autowired
	ITUploadTTBOtomatis repottb;
	
	public List<TUploadTTBOtomatis> getTtbOtoList(){
		return repottb.findAll();
	}
	
	public String exeTtbGetCsv() {
		return repottb.exeProsesCsvTBO();
	}
	
	public String exeProsesTtb() {
		return repottb.exeProsesTBO();
	}
	
}
