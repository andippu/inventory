package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.BatchBiaOh;
import com.invrepo.invrp.models.BatchBiaOhCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBatchBiaOh extends JpaRepository <BatchBiaOh,BatchBiaOhCompKey>{
	
	@Query(value = "SELECT * FROM BATCH_BIA_OH S WHERE TO_CHAR(BBOH_MBT_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<BatchBiaOh> getMboByDay(String day);
	
	@Query(value = "SELECT * FROM BATCH_BIA_OH S WHERE TO_CHAR(BBOH_MBT_TGL_BATCH,'Monyyyy')=?1",nativeQuery = true)
    public List<BatchBiaOh> getMboByMonth(String month);
	
	List<BatchBiaOh> findByBbohMbtNoBatch(String nobatch);
	
	BatchBiaOh findByBbohMbtNoBatchAndBbohSeq(String nobatch,Integer seq );

}
