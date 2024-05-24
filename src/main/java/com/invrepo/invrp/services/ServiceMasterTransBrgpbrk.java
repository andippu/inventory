package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.MasterTransBrgpbrk;
import com.invrepo.invrp.repository.IMasterTransBrgpbrk;


@Service

public class ServiceMasterTransBrgpbrk {
	
	@Autowired
	IMasterTransBrgpbrk RepoMtbpbrk;
	
	public List<MasterTransBrgpbrk> getMstBrgpbrkAll(){
		return RepoMtbpbrk.findAll();
	}
	
	public List<MasterTransBrgpbrk> getMstBrgpbrkByDay(String day){
		return RepoMtbpbrk.getMtpByDay(day);
	}
	
	public List<MasterTransBrgpbrk> getMstBrgpbrkByMonth(String month){
		return RepoMtbpbrk.getMtpByMonth(month);
	}
	
	public List<MasterTransBrgpbrk> getMtpNo(String mtpno){
		return RepoMtbpbrk.findByMtpNo(mtpno);
	}
	
	public MasterTransBrgpbrk getMtpNoSingle(String mtpno,String type){
		return RepoMtbpbrk.findByMtpNoAndMtpType(mtpno, type);
	}
	
	public String DeleteMstBrgpbrk(String mtpno,String type) {
		RepoMtbpbrk.getDelByMtpNo(mtpno, type);
		return "Delete Successfully";
	}
	
	public String saveUpdateMstBrgpbrk(MasterTransBrgpbrk mstbrgpbrk) {
		RepoMtbpbrk.save(mstbrgpbrk);
		return "Submit Successfully";
	}
	
	public String UpdateMasterTransBrgpbrk (String mtpno, String mtpdate, String mtptype, String mtpstatus, String mtpdesc,String mtpchguser, String mtpchgdate, String pmtpno, String pmtpdate, String pmtptype) {
		RepoMtbpbrk.updateWithMtpNoAndMtpType(mtpno, mtpdate, mtptype, mtpstatus, mtpdesc, mtpchguser, mtpchgdate, pmtpno, pmtpdate, pmtptype);
		return "Update Successfully";
	};

}
