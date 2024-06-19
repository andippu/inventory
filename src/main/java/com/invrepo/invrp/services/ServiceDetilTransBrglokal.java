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
	
	public List<DetilTransBrglokal> getDtlBrglokalByMtlnoMonth(String month, String mtlno, String type){
		return RepoDtlblokal.getDtlByMtlnoMonth(month, mtlno, type);
	}
	
	public List<DetilTransBrglokal> getDtlMtlNo(String mtlno){
		return RepoDtlblokal.findByDtlMtlNo(mtlno);
	}
	
	public DetilTransBrglokal getDtlMtlNoSingle(String mtlno,String type,String brcode,String batchno){
		return RepoDtlblokal.findByDtlMtlNoAndDtlMtlTypeAndDtlBrCodeAndDtlBatchNo(mtlno, type, brcode, batchno);
	}
	
	public String DelDtlBrglokal(String mtlno, String type) {
		RepoDtlblokal.getDelByMtlno(mtlno, type);
		return "Delete Successfully";
	}
	
	public String DelDtlBrglokalSingle(String mtlno, String type,String brcode,String batchno) {
		RepoDtlblokal.getDelByMtlnoSingle(mtlno, type, brcode, batchno);
		return "Delete Successfully";
	}
	
	public String DelTransLokal(String BATCHNO, String MTLTYPE,String BRCODE, Integer DTLQTY) {
		RepoDtlblokal.getDelTransLokal(BATCHNO, MTLTYPE, BRCODE, DTLQTY);		
		return "Delete lokal Successfully";
	}
	
	public String saveUpdateDtlBrglokal(DetilTransBrglokal dtlbrglokal) {
		RepoDtlblokal.save(dtlbrglokal);
		return "Submit Successfully";
	}
	
	public String UpdateDtlBrglokal (String dtlmtlno, String dtlmtldate, String dtlmtltype, String dtlbrcode, 
			String dtlbatchno,String dtlexpdate, String dtlqty, String dtlchguser, String dtlchgdate, String pmtlno
			, String pmtldate, String pmtltype, String pbrcode, String pbatchno) {
		RepoDtlblokal.updateWithDtlMtlNoAndDtlMtlType(dtlmtlno, dtlmtldate, dtlmtltype, dtlbrcode, dtlbatchno,
				dtlexpdate, dtlqty, dtlchguser, dtlchgdate, pmtlno, pmtldate, pmtltype, pbrcode, pbatchno);
		return "Update Successfully";
	};

}
