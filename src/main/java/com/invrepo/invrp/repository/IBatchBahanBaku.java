package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.BatchBahanBaku;
import com.invrepo.invrp.models.BatchBahanBakuCompKey;


@Repository
@CrossOrigin("http://localhost:4200")
public interface IBatchBahanBaku extends JpaRepository <BatchBahanBaku,BatchBahanBakuCompKey>{
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_BAKU S WHERE TO_CHAR(BBB_MBT_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<BatchBahanBaku> getMbbByDay(String day);
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_BAKU S WHERE TO_CHAR(BBB_MBT_TGL_BATCH,'Monyyyy')=?1",nativeQuery = true)
    public List<BatchBahanBaku> getMbbByMonth(String month);
	
	List<BatchBahanBaku> findByBbbMbtNoBatch(String nobatch);
	
	BatchBahanBaku findByBbbMbtNoBatchAndBbbBbCode(String nobatch,String code);

}
