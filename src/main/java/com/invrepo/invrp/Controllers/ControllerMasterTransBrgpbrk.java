package com.invrepo.invrp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.MasterTransBrgpbrk;
import com.invrepo.invrp.services.ServiceMasterTransBrgpbrk;


@RestController
@CrossOrigin("http://localhost:4200")

public class ControllerMasterTransBrgpbrk {
	
	@Autowired
	ServiceMasterTransBrgpbrk ServMtbpbrk;
	
	@GetMapping("/mstbrgpbrk/getbrgpbrkall")
	public List<MasterTransBrgpbrk> getBrgpbrk(){
		//System.out.println("testbbbb");
        return ServMtbpbrk.getMstBrgpbrkAll();
    }
	
	@GetMapping("/mstbrgpbrk/getbrgpbrkday")
	public List<MasterTransBrgpbrk> getBrgpbrkListDay(String day){
        return ServMtbpbrk.getMstBrgpbrkByDay(day);
    }
	
	@GetMapping("/mstbrgpbrk/getbrgpbrkmonth")
	public List<MasterTransBrgpbrk> getBrgpbrkListMonth(String month){
        return ServMtbpbrk.getMstBrgpbrkByMonth(month);
    }
	
	@GetMapping("/mstbrgpbrk/getmtpno")
	public List<MasterTransBrgpbrk> getMtpNo(String mtpno){
        return ServMtbpbrk.getMtpNo(mtpno);
    }
	
	@GetMapping("/mstbrgpbrk/getmtpnosingle")
	public MasterTransBrgpbrk getMtpNoSingle(String mtpno,String type){
        return ServMtbpbrk.getMtpNoSingle(mtpno, type);
    }
	
	@GetMapping("/mstbrgpbrk/deletemstbrgpbrk")
	public String DeleteMstBrgpbrk (String mtpno,String type){
        ServMtbpbrk.DeleteMstBrgpbrk(mtpno, type);
        return "Delete Successfully";
    }
	
	@PostMapping("/mstbrgpbrk/saveupdatemstbrgpbrk")
	public String  SaveUpdateMstBrgpbrk(@RequestBody MasterTransBrgpbrk mstbrgpbrk){
		ServMtbpbrk.saveUpdateMstBrgpbrk(mstbrgpbrk);
        return "Submit Successfully";
    }
	
	@GetMapping("/mstbrgpbrk/updatemstbrgpbrk")
	public String UpdateMasterTransBrngpbrk (String mtpno, String mtpdate, String mtptype, String mtpstatus, String mtpdesc,String mtpchguser, String mtpchgdate, String pmtpno, String pmtpdate, String pmtptype) {
		ServMtbpbrk.UpdateMasterTransBrgpbrk(mtpno, mtpdate, mtptype, mtpstatus, mtpdesc, mtpchguser, mtpchgdate, pmtpno, pmtpdate, pmtptype);
		return "Update Successfully";
	}

}
