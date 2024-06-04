package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.DetilTransBrgpbrk;
import com.invrepo.invrp.services.ServiceDetilTransBrgpbrk;

@RestController
@CrossOrigin("http://localhost:4200")

public class ControllerDetilTransBrgpbrk {
	
	@Autowired
	ServiceDetilTransBrgpbrk ServDtlbpbrk;
	
	@GetMapping("/dtlbrgpbrk/getdtlpbrkall")
	public List<DetilTransBrgpbrk> getDtlBrgpbrk(){
		//System.out.println("testbbbb");
        return ServDtlbpbrk.getDtlBrgpbrkAll();
    }
	
	@GetMapping("/dtlbrgpbrk/getdtlpbrkday")
	public List<DetilTransBrgpbrk> getDtlpbrkListDay(String day){
        return ServDtlbpbrk.getDtlBrgpbrkByDay(day);
    }
	
	@GetMapping("/dtlbrgpbrk/getdtlpbrkmonth")
	public List<DetilTransBrgpbrk> getDtlpbrkListMonth(String month){
        return ServDtlbpbrk.getDtlBrgpbrkByMonth(month);
    }
	
	@GetMapping("/dtlbrgpbrk/getdtlpbrkmtpnomonth")
	public List<DetilTransBrgpbrk> getDtlpbrkListMtpnoMonth(String month, String mtlno, String type){
        return ServDtlbpbrk.getDtlBrgpbrkByMtpnoMonth(month, mtlno, type);
    }
	
	@GetMapping("/dtlbrgpbrk/getdtlmtpno")
	public List<DetilTransBrgpbrk> getDtlMtpNo(String mtpno){
        return ServDtlbpbrk.getDtlMtpNo(mtpno);
    }
	
	@GetMapping("/dtlbrgpbrk/getmtpnosingle")
	public DetilTransBrgpbrk getDtlMtpNoSingle(String mtpno,String type,String brcode,String batchno){
        return ServDtlbpbrk.getDtlMtpNoSingle(mtpno, type, brcode, batchno);
    }
	
	@GetMapping("/dtlbrgpbrk/deletedtlbrgpbrk")
	public String  DelMstDtlpbrk(String mtpno, String type){
		ServDtlbpbrk.DeleteDtlBrgpbrk(mtpno, type);
        return "Delete Successfully";
    }
	
	@GetMapping("/dtlbrgpbrk/deletedtlbrgpbrksingle")
	public String  DelMstDtlpbrkSingle(String mtpno, String type, String brcode, String batchno){
		ServDtlbpbrk.DeleteDtlBrgpbrkSingle(mtpno, type, brcode, batchno);
        return "Delete Successfully";
    }
	
	@GetMapping("/dtlbrgpbrk/deltranspabrik")
	public String DelTransPabrik(String BATCHNO, String MTPTYPE,String BRCODE, Integer DTPQTY, String MTPSTATUS){
		ServDtlbpbrk.DelTransPabrik(BATCHNO, MTPTYPE, BRCODE, DTPQTY, MTPSTATUS);
		return "Delete Trans Pabrik";
	}
	
	@PostMapping("/dtlbrgpbrk/saveupdatedtlbrgpbrk")
	public String  SaveUpdateMstBrgpbrk(@RequestBody DetilTransBrgpbrk dtlbrglokal){
		ServDtlbpbrk.saveUpdateDtlBrgpbrk(dtlbrglokal);
        return "Submit Successfully";
    }
	
	@GetMapping("/dtlbrgpbrk/updatedtlbrgpbrk")
	public String UpdateDetilTransBrngpbrk (String dtpmtpno, String dtpmtpdate, String dtpmtptype, String dtpbrcode, 
			String dtpbatchno,String dtpqty, String dtpchguser, String dtpchgdate, String pmtpno
			, String pmtpdate, String pmtptype, String pbrcode, String pbatchno){
		ServDtlbpbrk.UpdateDtlBrgpbrk(dtpmtpno, dtpmtpdate, dtpmtptype, dtpbrcode, dtpbatchno, dtpqty, dtpchguser,
			dtpchgdate, pmtpno, pmtpdate, pmtptype, pbrcode, pbatchno);
		return "Update Successfully";
	}

}
