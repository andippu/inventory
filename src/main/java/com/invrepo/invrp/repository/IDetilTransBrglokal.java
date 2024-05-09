package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.DetilTransBrglokal;
import com.invrepo.invrp.models.DetilTransBrglokalCompKey;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IDetilTransBrglokal extends JpaRepository <DetilTransBrglokal,DetilTransBrglokalCompKey> {
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGLOKAL S WHERE TO_CHAR(DTL_MTL_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<DetilTransBrglokal> getDtlMtlByDay(String day);
	
	@Query(value = "SELECT * FROM DETIL_TRANS_BRGLOKAL S WHERE TO_CHAR(DTL_MTL_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<DetilTransBrglokal> getDtlMtlByMonth(String month);
	
	List<DetilTransBrglokal> findByDtlMtlNo(String mtlno);
	
	DetilTransBrglokal findByDtlMtlNoAndDtlMtlTypeAndDtlBrCodeAndDtlBatchNo (String mtlno,String type,String brcode,String batchno);

}
