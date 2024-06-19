package com.invrepo.invrp.Controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.DetilTransBrglokal;
import com.invrepo.invrp.services.ServiceDetilTransBrglokal;

@RestController
@CrossOrigin("http://localhost:4200")

public class ControllerDetilTransBrglokal {
	
	@Autowired
	ServiceDetilTransBrglokal ServDtlblokal;
	
	@GetMapping("/dtlbrglokal/getdtllokalall")
	public List<DetilTransBrglokal> getDtlBrglokal(){
		//System.out.println("testbbbb");
        return ServDtlblokal.getDtlBrglokalAll();
    }
	
	@GetMapping("/dtlbrglokal/getdtllokalday")
	public List<DetilTransBrglokal> getDtllokalListDay(String day){
        return ServDtlblokal.getDtlBrglokalByDay(day);
    }
	
	@GetMapping("/dtlbrglokal/getdtllokalmonth")
	public List<DetilTransBrglokal> getDtllokalListMonth(String month){
        return ServDtlblokal.getDtlBrglokalByMonth(month);
    }
	
	@GetMapping("/dtlbrglokal/getdtllokalmtlnomonth")
	public List<DetilTransBrglokal> getDtllokalListMtlnoMonth(String month, String mtlno, String type){
        return ServDtlblokal.getDtlBrglokalByMtlnoMonth(month, mtlno, type);
    }
	
	@GetMapping("/dtlbrglokal/getdtlmtlno")
	public List<DetilTransBrglokal> getDtlMtlNo(String mtlno){
        return ServDtlblokal.getDtlMtlNo(mtlno);
    }
	
	@GetMapping("/dtlbrglokal/getmtlnosingle")
	public DetilTransBrglokal getDtlMtlNoSingle(String mtlno,String type,String brcode,String batchno){
        return ServDtlblokal.getDtlMtlNoSingle(mtlno, type, brcode, batchno);
    }
	
	@GetMapping("/dtlbrglokal/deletedtlbrglokal")
	public String DelMstBrglokal(String mtlno, String type){
		ServDtlblokal.DelDtlBrglokal(mtlno, type);
        return "Delete Successfully";
    }
	
	@GetMapping("/dtlbrglokal/deletedtlbrglokalsingle")
	public String DelMstBrglokalSingle(String mtlno, String type,String brcode,String batchno){
		ServDtlblokal.DelDtlBrglokalSingle(mtlno, type, brcode, batchno);
        return "Delete Successfully";
    }
	
	@GetMapping("/dtlbrglokal/deltranslokal")
	public String DelTransLokal(String BATCHNO, String MTLTYPE,String BRCODE, BigDecimal DTLQTY){
		ServDtlblokal.DelTransLokal(BATCHNO,  MTLTYPE, BRCODE,  DTLQTY);
		return "Delete lokal";
	}
	
	@PostMapping("/dtlbrglokal/saveupdatedtlbrglokal")
	public String  SaveUpdateMstBrglokal(@RequestBody DetilTransBrglokal dtlbrglokal){
		ServDtlblokal.saveUpdateDtlBrglokal(dtlbrglokal);
        return "Submit Successfully";
    }
	
	@GetMapping("/dtlbrglokal/updatedtlbrglokal")
	public String UpdateDetilTransBrnglokal (String dtlmtlno, String dtlmtldate, String dtlmtltype, String dtlbrcode, 
			String dtlbatchno,String dtlexpdate, String dtlqty, String dtlchguser, String dtlchgdate, String pmtlno
			, String pmtldate, String pmtltype, String pbrcode, String pbatchno){
		ServDtlblokal.UpdateDtlBrglokal(dtlmtlno, dtlmtldate, dtlmtltype, dtlbrcode, dtlbatchno, dtlexpdate, dtlqty,
				dtlchguser, dtlchgdate, pmtlno, pmtldate, pmtltype, pbrcode, pbatchno);
		return "Update Successfully";
	}

}
