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
	
	@GetMapping("/dtlbrgpbrk/getdtlmtpno")
	public List<DetilTransBrgpbrk> getDtlMtpNo(String mtpno){
        return ServDtlbpbrk.getDtlMtpNo(mtpno);
    }
	
	@GetMapping("/dtlbrgpbrk/getmtpnosingle")
	public DetilTransBrgpbrk getDtlMtpNoSingle(String mtpno,String type,String brcode,String batchno){
        return ServDtlbpbrk.getDtlMtpNoSingle(mtpno, type, brcode, batchno);
    }
	
	@PostMapping("/dtlbrgpbrk/saveupdatedtlbrgpbrk")
	public String  SaveUpdateMstBrgpbrk(@RequestBody DetilTransBrgpbrk dtlbrglokal){
		ServDtlbpbrk.saveUpdateDtlBrgpbrk(dtlbrglokal);
        return "Submit Successfully";
    }

}
