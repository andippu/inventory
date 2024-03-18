package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.BatchBahanKemas;
import com.invrepo.invrp.models.BatchBahanKemasCompKey;


@Repository
@CrossOrigin("http://localhost:4200")
public interface IBatchBahanKemas extends JpaRepository <BatchBahanKemas,BatchBahanKemasCompKey>{
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_KEMAS S WHERE TO_CHAR(BBK_MBT_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<BatchBahanKemas> getMbkByDay(String day);
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_KEMAS S WHERE TO_CHAR(BBK_MBT_TGL_BATCH,'Monyyyy')=?1",nativeQuery = true)
    public List<BatchBahanKemas> getMbkByMonth(String month);
	
	List<BatchBahanKemas> findByBbkMbtNoBatch(String nobatch);
	
	BatchBahanKemas findByBbkMbtNoBatchAndBbkBkCode(String nobatch, String code);

}
