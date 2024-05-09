package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.DetilTransBrgpbrk;
import com.invrepo.invrp.models.DetilTransBrgpbrkCompKey;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IDetilTransBrgpbrk extends JpaRepository <DetilTransBrgpbrk,DetilTransBrgpbrkCompKey> {
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGPBRK S WHERE TO_CHAR(DTP_MTP_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<DetilTransBrgpbrk> getDtpMtpByDay(String day);
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGPBRK S WHERE TO_CHAR(DTP_MTP_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<DetilTransBrgpbrk> getDtpMtpByMonth(String month);
	
	List<DetilTransBrgpbrk> findByDtpMtpNo(String mtpno);
	
	DetilTransBrgpbrk findByDtpMtpNoAndDtpMtpTypeAndDtpBrCodeAndDtpBatchNo (String mtpno,String type,String brcode,String batchno);

}
