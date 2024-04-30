package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.BatchBahanBaku;
import com.invrepo.invrp.models.BatchBahanBakuCompKey;

import jakarta.transaction.Transactional;


@Repository
@CrossOrigin("http://localhost:4200")
public interface IBatchBahanBaku extends JpaRepository <BatchBahanBaku,BatchBahanBakuCompKey>{
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_BAKU S WHERE TO_CHAR(BBB_MBT_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<BatchBahanBaku> getMbbByDay(String day);
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_BAKU S WHERE TO_CHAR(BBB_MBT_TGL_BATCH,'Monyyyy')=?1",nativeQuery = true)
    public List<BatchBahanBaku> getMbbByMonth(String month);
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_BAKU S WHERE TO_CHAR(BBB_MBT_TGL_BATCH,'dd/mm/yyyy')=?1 AND BBB_MBT_NO_BATCH=?2",nativeQuery = true)
    public List<BatchBahanBaku> getMbbByNoBatchMonth(String month, String nobatch);
	
	List<BatchBahanBaku> findByBbbMbtNoBatch(String nobatch);
	
	BatchBahanBaku findByBbbMbtNoBatchAndBbbBbCode(String nobatch,String code);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE BATCH_BAHAN_BAKU c SET c.BBB_MBT_NO_BATCH = ?1, c.BBB_MBT_TGL_BATCH = ?2, c.BBB_NO = ?3, c.BBB_BB_CODE = ?4,"
			+ " c.BBB_UNIT = ?5, c.BBB_SAT_CODE = ?6, c.BBB_HARGA_SAT = ?7, c.BBB_TOTAL = ?8, c.BBB_CHGUSER = ?9, c.BBB_CHGDATE = ?10 "
			+ "WHERE c.BBB_MBT_NO_BATCH = ?11 AND c.BBB_MBT_TGL_BATCH = ?12 AND c.BBB_BB_CODE = ?13" ,nativeQuery = true)
	int updateWithBbbMbtNoBatchAndBbbBbCode(String nobatch, String tglbatch, int bkno, String bkcode, int bkunit, String satcode, int bkharga, int bktotal, String bkchguser, String bkchgdate, String pnobatch, String ptglbatch, String pbkcode);

}
