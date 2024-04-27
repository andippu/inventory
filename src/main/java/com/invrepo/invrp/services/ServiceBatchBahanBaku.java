package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.BatchBahanBaku;
import com.invrepo.invrp.models.MasterBatch;
import com.invrepo.invrp.repository.IBatchBahanBaku;

//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Service
public class ServiceBatchBahanBaku {
	
	@Autowired
	IBatchBahanBaku RepoSBBBaku;
	
	public List<BatchBahanBaku> getBahanBakuAll(){
		return RepoSBBBaku.findAll();
    }
	
	public List<BatchBahanBaku> getBatchBakuByDay(String day){
	       // System.out.println("test dt :"+dt);
	          return RepoSBBBaku.getMbbByDay(day);
	}
	
	public List<BatchBahanBaku> getBatchBakuByMonth(String month){
	       // System.out.println("test dt :"+dt);
	          return RepoSBBBaku.getMbbByMonth(month);
	}
	
	public List<BatchBahanBaku> getMbbNoBatch(String nobatch){
		return RepoSBBBaku.findByBbbMbtNoBatch(nobatch);		
	}
	
	public  BatchBahanBaku getMbbNoBatchSingle(String nobatch, String code){
        return RepoSBBBaku.findByBbbMbtNoBatchAndBbbBbCode(nobatch, code);
    }
	
	public String saveUpdateBahanBaku(BatchBahanBaku batchbaku) {
		RepoSBBBaku.save(batchbaku);
		return "Submit Successfully";
	}
	
	public String UpdateBahanBaku(String nobatch, String tglbatch, int bkno, String bkcode, int bkunit, String satcode, int bkharga, int bktotal, String bkchguser, String bkchgdate, String pnobatch, String ptglbatch, String pbkcode) {
		RepoSBBBaku.updateWithBbbMbtNoBatchAndBbbBbCode(nobatch, tglbatch, bkno, bkcode, bkunit, satcode, bkharga, bktotal, bkchguser, bkchgdate, pnobatch, ptglbatch, pbkcode);
		return "Update Successfully";
	}

};
