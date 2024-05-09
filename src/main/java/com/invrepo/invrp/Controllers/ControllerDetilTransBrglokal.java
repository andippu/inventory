package com.invrepo.invrp.Controllers;

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
	
	@GetMapping("/dtlbrglokal/getdtlmtlno")
	public List<DetilTransBrglokal> getDtlMtlNo(String mtlno){
        return ServDtlblokal.getDtlMtlNo(mtlno);
    }
	
	@GetMapping("/dtlbrglokal/getmtlnosingle")
	public DetilTransBrglokal getDtlMtlNoSingle(String mtlno,String type,String brcode,String batchno){
        return ServDtlblokal.getDtlMtlNoSingle(mtlno, type, brcode, batchno);
    }
	
	@PostMapping("/dtlbrglokal/saveupdatedtlbrglokal")
	public String  SaveUpdateMstBrglokal(@RequestBody DetilTransBrglokal dtlbrglokal){
		ServDtlblokal.saveUpdateDtlBrglokal(dtlbrglokal);
        return "Submit Successfully";
    }

}
