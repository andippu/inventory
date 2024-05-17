package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.MasterTransBrglokal;
import com.invrepo.invrp.models.MasterTransBrglokalCompKey;

import jakarta.transaction.Transactional;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IMasterTransBrglokal extends JpaRepository <MasterTransBrglokal,MasterTransBrglokalCompKey> {
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGLOKAL S WHERE TO_CHAR(MTL_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<MasterTransBrglokal> getMtlByDay(String day);
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGLOKAL S WHERE TO_CHAR(MTL_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<MasterTransBrglokal> getMtlByMonth(String month);
	
	List<MasterTransBrglokal> findByMtlNo(String mtlno);
	
	MasterTransBrglokal findByMtlNoAndMtlType (String mtlno,String type);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE MASTER_TRANS_BRGLOKAL c SET c.MTL_NO = ?1, c.MTL_DATE = ?2, c.MTL_TYPE = ?3, c.MTL_DESC = ?4,"
			+ " c.MTL_CHGUSER = ?5, c.MTL_CHGDATE = ?6 WHERE c.MTL_NO = ?7 AND c.MTL_DATE"
			+ " = ?8 AND c.MTL_TYPE = ?9" ,nativeQuery = true)
	int updateWithMtlNoAndMtlType(String mtlno, String mtldate, String mtltype, String mtldesc,String mtlchguser, String mtlchgdate, String pmtlno, String pmtldate, String pmtltype);

}
