package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.MasterTransBrglokal;
import com.invrepo.invrp.repository.IMasterTransBrglokal;

@Service

public class ServiceMasterTransBrglokal {
	
	@Autowired
	IMasterTransBrglokal RepoMtblokal;
	
	public List<MasterTransBrglokal> getMstBrglokalAll(){
		return RepoMtblokal.findAll();
	}
	
	public List<MasterTransBrglokal> getMstBrglokalByDay(String day){
		return RepoMtblokal.getMtlByDay(day);
	}
	
	public List<MasterTransBrglokal> getMstBrglokalByMonth(String month){
		return RepoMtblokal.getMtlByMonth(month);
	}
	
	public List<MasterTransBrglokal> getMtlNo(String mtlno){
		return RepoMtblokal.findByMtlNo(mtlno);
	}
	
	public String DeleteMstBrglokal(String mtlno,String type) {
		RepoMtblokal.getDelByMtlNo(mtlno, type);
		return "Delete Successfully";
	}
	
	public MasterTransBrglokal getMtlNoSingle(String mtlno,String type){
		return RepoMtblokal.findByMtlNoAndMtlType(mtlno, type);
	}
	
	public String saveUpdateMstBrglokal(MasterTransBrglokal mstbrglokal) {
		RepoMtblokal.save(mstbrglokal);
		return "Submit Successfully";
	}
	
	public String UpdateMasterTransBrglokal (String mtlno, String mtldate, String mtltype, String mtldesc,String mtlchguser, String mtlchgdate, String pmtlno, String pmtldate, String pmtltype) {
		RepoMtblokal.updateWithMtlNoAndMtlType(mtlno, mtldate, mtltype, mtldesc, mtlchguser, mtlchgdate, pmtlno, pmtldate, pmtltype);
		return "Update Successfully";
	};

}
