package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.MasterTransBrglokal;
import com.invrepo.invrp.services.ServiceMasterTransBrglokal;

@RestController
@CrossOrigin("http://localhost:4200")

public class ControllerMasterTransBrglokal {
	
	@Autowired
	ServiceMasterTransBrglokal ServMtblokal;
	
	@GetMapping("/mstbrglokal/getbrglokalall")
	public List<MasterTransBrglokal> getBrglokal(){
		//System.out.println("testbbbb");
        return ServMtblokal.getMstBrglokalAll();
    }
	
	@GetMapping("/mstbrglokal/getbrglokalday")
	public List<MasterTransBrglokal> getBrglokalListDay(String day){
        return ServMtblokal.getMstBrglokalByDay(day);
    }
	
	@GetMapping("/mstbrglokal/getbrglokalmonth")
	public List<MasterTransBrglokal> getBrglokalListMonth(String month){
        return ServMtblokal.getMstBrglokalByMonth(month);
    }
	
	@GetMapping("/mstbrglokal/getmtlno")
	public List<MasterTransBrglokal> getMtlNo(String mtlno){
        return ServMtblokal.getMtlNo(mtlno);
    }
	
	@GetMapping("/mstbrglokal/getmtlnosingle")
	public MasterTransBrglokal getMtlNoSingle(String mtlno,String type){
        return ServMtblokal.getMtlNoSingle(mtlno, type);
    }
	
	@PostMapping("/mstbrglokal/saveupdatemstbrglokal")
	public String  SaveUpdateMstBrglokal(@RequestBody MasterTransBrglokal mstbrglokal){
        ServMtblokal.saveUpdateMstBrglokal(mstbrglokal);
        return "Submit Successfully";
    }
	
	@GetMapping("/mstbrglokal/updatemstbrglokal")
	public String UpdateMasterTransBrnglokal (String mtlno, String mtldate, String mtltype, String mtldesc,String mtlchguser, String mtlchgdate, String pmtlno, String pmtldate, String pmtltype) {
		ServMtblokal.UpdateMasterTransBrglokal(mtlno, mtldate, mtltype, mtldesc, mtlchguser, mtlchgdate, pmtlno, pmtldate, pmtltype);
		return "Update Successfully";
	}

}
