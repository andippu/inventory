package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.MasterTransBrgpbrk;
import com.invrepo.invrp.models.MasterTransBrgpbrkCompKey;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IMasterTransBrgpbrk extends JpaRepository <MasterTransBrgpbrk,MasterTransBrgpbrkCompKey> {
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGPBRK S WHERE TO_CHAR(MTP_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<MasterTransBrgpbrk> getMtpByDay(String day);
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGPBRK S WHERE TO_CHAR(MTP_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<MasterTransBrgpbrk> getMtpByMonth(String month);
	
	List<MasterTransBrgpbrk> findByMtpNo(String mtpno);
	
	MasterTransBrgpbrk findByMtpNoAndMtpType (String mtpno,String type);

}
