package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.DetilTransBrgpbrk;
import com.invrepo.invrp.repository.IDetilTransBrgpbrk;

@Service

public class ServiceDetilTransBrgpbrk {
	
	@Autowired
	IDetilTransBrgpbrk RepoDtlbpbrk;
	
	public List<DetilTransBrgpbrk> getDtlBrgpbrkAll(){
		return RepoDtlbpbrk.findAll();
	}
	
	public List<DetilTransBrgpbrk> getDtlBrgpbrkByDay(String day){
		return RepoDtlbpbrk.getDtpMtpByDay(day);
	}
	
	public List<DetilTransBrgpbrk> getDtlBrgpbrkByMonth(String month){
		return RepoDtlbpbrk.getDtpMtpByMonth(month);
	}
	
	public List<DetilTransBrgpbrk> getDtlBrgpbrkByMtpnoMonth(String month, String mtlno, String type){
		return RepoDtlbpbrk.getDtlByMtpnoMonth(month, mtlno, type);
	}
	
	public List<DetilTransBrgpbrk> getDtlMtpNo(String mtpno){
		return RepoDtlbpbrk.findByDtpMtpNo(mtpno);
	}
	
	public DetilTransBrgpbrk getDtlMtpNoSingle(String mtpno,String type,String brcode,String batchno){
		return RepoDtlbpbrk.findByDtpMtpNoAndDtpMtpTypeAndDtpBrCodeAndDtpBatchNo(mtpno, type, brcode, batchno);
	}
	
	public String saveUpdateDtlBrgpbrk(DetilTransBrgpbrk dtlbrgpbrk) {
		RepoDtlbpbrk.save(dtlbrgpbrk);
		return "Submit Successfully";
	}
	
	public String UpdateDtlBrgpbrk (String dtpmtpno, String dtpmtpdate, String dtpmtptype, String dtpbrcode, 
			String dtpbatchno,String dtpqty, String dtpchguser, String dtpchgdate, String pmtpno
			, String pmtpdate, String pmtptype, String pbrcode, String pbatchno) {
		RepoDtlbpbrk.updateWithDtpMtpNoAndDpMtpType(dtpmtpno, dtpmtpdate, dtpmtptype, dtpbrcode, dtpbatchno, dtpqty,
			dtpchguser, dtpchgdate, pmtpno, pmtpdate, pmtptype, pbrcode, pbatchno);
		return "Update Successfully";
	};

}
