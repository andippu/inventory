package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.DetilTransBrglokal;
import com.invrepo.invrp.models.DetilTransBrglokalCompKey;

import jakarta.transaction.Transactional;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IDetilTransBrglokal extends JpaRepository <DetilTransBrglokal,DetilTransBrglokalCompKey> {
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGLOKAL S WHERE TO_CHAR(DTL_MTL_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<DetilTransBrglokal> getDtlMtlByDay(String day);
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGLOKAL S WHERE TO_CHAR(DTL_MTL_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<DetilTransBrglokal> getDtlMtlByMonth(String month);
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGLOKAL S WHERE TO_CHAR(DTL_MTL_DATE,'dd/mm/yyyy')=?1 AND DTL_MTL_NO=?2 AND DTL_MTL_TYPE=?3",nativeQuery = true)
    public List<DetilTransBrglokal> getDtlByMtlnoMonth(String month, String mtlno, String type);
	
	List<DetilTransBrglokal> findByDtlMtlNo(String mtlno);
	
	DetilTransBrglokal findByDtlMtlNoAndDtlMtlTypeAndDtlBrCodeAndDtlBatchNo (String mtlno,String type,String brcode,String batchno);
    
	@Transactional
	@Modifying
	@Query(value = "UPDATE DETIL_TRANS_BRGLOKAL c SET c.DTL_MTL_NO = ?1, c.DTL_MTL_DATE = ?2, c.DTL_MTL_TYPE = ?3, c.DTL_BR_CODE = ?4, c.DTL_BATCH_NO = ?5,"
			+ " c.DTL_EXP_DATE = ?6, c.DTL_QTY = ?7, c.DTL_CHGUSER = ?8, c.DTL_CHGDATE = ?9 WHERE c.DTL_MTL_NO = ?10 AND c.DTL_MTL_DATE"
			+ " = ?11 AND c.DTL_MTL_TYPE = ?12 AND c.DTL_BR_CODE = ?13 AND c.DTL_BATCH_NO = ?14" ,nativeQuery = true)
	int updateWithDtlMtlNoAndDtlMtlType(String dtlmtlno, String dtlmtldate, String dtlmtltype, String dtlbrcode, 
		String dtlbatchno,String dtlexpdate, String dtlqty, String dtlchguser, String dtlchgdate, String pmtlno
		, String pmtldate, String pmtltype, String pbrcode, String pbatchno);
	
}
