package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.BatchBahanKemas;
import com.invrepo.invrp.models.BatchBahanKemasCompKey;

import jakarta.transaction.Transactional;


@Repository
@CrossOrigin("http://localhost:4200")
public interface IBatchBahanKemas extends JpaRepository <BatchBahanKemas,BatchBahanKemasCompKey>{
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_KEMAS S WHERE TO_CHAR(BBK_MBT_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<BatchBahanKemas> getMbkByDay(String day);
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_KEMAS S WHERE TO_CHAR(BBK_MBT_TGL_BATCH,'Monyyyy')=?1",nativeQuery = true)
    public List<BatchBahanKemas> getMbkByMonth(String month);
	
	@Query(value = "SELECT * FROM BATCH_BAHAN_KEMAS S WHERE TO_CHAR(BBK_MBT_TGL_BATCH,'dd/mm/yyyy')=?1 AND BBK_MBT_NO_BATCH=?2",nativeQuery = true)
    public List<BatchBahanKemas> getMbkByNoBatchMonth(String month, String nobatch);
	
	List<BatchBahanKemas> findByBbkMbtNoBatch(String nobatch);
	
	BatchBahanKemas findByBbkMbtNoBatchAndBbkBkCode(String nobatch, String code);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE BATCH_BAHAN_KEMAS c SET c.BBK_MBT_NO_BATCH = ?1, c.BBK_MBT_TGL_BATCH = ?2, c.BBK_NO = ?3, c.BBK_BK_CODE = ?4,"
			+ " c.BBK_UNIT = ?5, c.BBK_SAT_CODE = ?6, c.BBK_HARGA_SAT = ?7, c.BBK_TOTAL = ?8, c.BBK_CHGUSER = ?9, c.BBK_CHGDATE = ?10 "
			+ "WHERE c.BBK_MBT_NO_BATCH = ?11 AND c.BBK_MBT_TGL_BATCH = ?12 AND c.BBK_BK_CODE = ?13" ,nativeQuery = true)
	int updateWithBbkMbtNoBatchAndBbkBkCode(String nobatch, String tglbatch, int bkno, String bkcode, int bkunit, String satcode, int bkharga, int bktotal, String bkchguser, String bkchgdate, String pnobatch, String ptglbatch, String pbkcode);

}
