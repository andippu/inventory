package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.DetilTransBrglokal;
import com.invrepo.invrp.repository.IDetilTransBrglokal;

@Service

public class ServiceDetilTransBrglokal {
	
	@Autowired
	IDetilTransBrglokal RepoDtlblokal;
	
	public List<DetilTransBrglokal> getDtlBrglokalAll(){
		return RepoDtlblokal.findAll();
	}
	
	public List<DetilTransBrglokal> getDtlBrglokalByDay(String day){
		return RepoDtlblokal.getDtlMtlByDay(day);
	}
	
	public List<DetilTransBrglokal> getDtlBrglokalByMonth(String month){
		return RepoDtlblokal.getDtlMtlByMonth(month);
	}
	
	public List<DetilTransBrglokal> getDtlMtlNo(String mtlno){
		return RepoDtlblokal.findByDtlMtlNo(mtlno);
	}
	
	public DetilTransBrglokal getDtlMtlNoSingle(String mtlno,String type,String brcode,String batchno){
		return RepoDtlblokal.findByDtlMtlNoAndDtlMtlTypeAndDtlBrCodeAndDtlBatchNo(mtlno, type, brcode, batchno);
	}
	
	public String saveUpdateDtlBrglokal(DetilTransBrglokal dtlbrglokal) {
		RepoDtlblokal.save(dtlbrglokal);
		return "Submit Successfully";
	}

}
