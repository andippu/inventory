package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.MasterTransBrgpbrk;
import com.invrepo.invrp.models.MasterTransBrgpbrkCompKey;

import jakarta.transaction.Transactional;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IMasterTransBrgpbrk extends JpaRepository <MasterTransBrgpbrk,MasterTransBrgpbrkCompKey> {
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGPBRK S WHERE TO_CHAR(MTP_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<MasterTransBrgpbrk> getMtpByDay(String day);
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGPBRK S WHERE TO_CHAR(MTP_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<MasterTransBrgpbrk> getMtpByMonth(String month);
	
	List<MasterTransBrgpbrk> findByMtpNo(String mtpno);
	
	MasterTransBrgpbrk findByMtpNoAndMtpType (String mtpno,String type);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE MASTER_TRANS_BRGPBRK c SET c.MTP_NO = ?1, c.MTP_DATE = ?2, c.MTP_TYPE = ?3, c.MTP_STATUS = ?4, c.MTP_DESC = ?5,"
			+ " c.MTP_CHGUSER = ?6, c.MTP_CHGDATE = ?7 WHERE c.MTP_NO = ?8 AND c.MTP_DATE"
			+ " = ?9 AND c.MTP_TYPE = ?10" ,nativeQuery = true)
	int updateWithMtpNoAndMtpType(String mtpno, String mtpdate, String mtptype, String mtpstatus, String mtpdesc,String mtpchguser, String mtpchgdate, String pmtpno, String pmtpdate, String pmtptype);

}
