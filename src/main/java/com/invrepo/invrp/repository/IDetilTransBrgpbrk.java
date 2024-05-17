package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.DetilTransBrglokal;
import com.invrepo.invrp.models.DetilTransBrgpbrk;
import com.invrepo.invrp.models.DetilTransBrgpbrkCompKey;

import jakarta.transaction.Transactional;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IDetilTransBrgpbrk extends JpaRepository <DetilTransBrgpbrk,DetilTransBrgpbrkCompKey> {
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGPBRK S WHERE TO_CHAR(DTP_MTP_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<DetilTransBrgpbrk> getDtpMtpByDay(String day);
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGPBRK S WHERE TO_CHAR(DTP_MTP_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<DetilTransBrgpbrk> getDtpMtpByMonth(String month);
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGPBRK S WHERE TO_CHAR(DTP_MTP_DATE,'dd/mm/yyyy')=?1 AND DTP_MTP_NO=?2 AND DTP_MTP_TYPE=?3",nativeQuery = true)
    public List<DetilTransBrgpbrk> getDtlByMtpnoMonth(String month, String mtlno, String type);
	
	List<DetilTransBrgpbrk> findByDtpMtpNo(String mtpno);
	
	DetilTransBrgpbrk findByDtpMtpNoAndDtpMtpTypeAndDtpBrCodeAndDtpBatchNo (String mtpno,String type,String brcode,String batchno);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE DETIL_TRANS_BRGPBRK c SET c.DTP_MTP_NO = ?1, c.DTP_MTP_DATE = ?2, c.DTP_MTP_TYPE = ?3, c.DTP_BR_CODE = ?4, c.DTP_BATCH_NO = ?5,"
			+ " c.DTP_QTY = ?6, c.DTP_CHGUSER = ?7, c.DTP_CHGDATE = ?8 WHERE c.DTP_MTP_NO = ?9 AND c.DTP_MTP_DATE"
			+ " = ?10 AND c.DTP_MTP_TYPE = ?11 AND c.DTP_BR_CODE = ?12 AND c.DTP_BATCH_NO = ?13" ,nativeQuery = true)
	int updateWithDtpMtpNoAndDpMtpType(String dtpmtpno, String dtpmtpdate, String dtpmtptype, String dtpbrcode, 
		String dtpbatchno,String dtpqty, String dtpchguser, String dtpchgdate, String pmtpno
		, String pmtpdate, String pmtptype, String pbrcode, String pbatchno);

}
