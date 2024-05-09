package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.MasterTransBrglokal;
import com.invrepo.invrp.models.MasterTransBrglokalCompKey;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IMasterTransBrglokal extends JpaRepository <MasterTransBrglokal,MasterTransBrglokalCompKey> {
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGLOKAL S WHERE TO_CHAR(MTL_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<MasterTransBrglokal> getMtlByDay(String day);
	
	@Query(value = "SELECT * FROM MASTER_TRANS_BRGLOKAL S WHERE TO_CHAR(MTL_DATE,'Monyyyy')=?1",nativeQuery = true)
    public List<MasterTransBrglokal> getMtlByMonth(String month);
	
	List<MasterTransBrglokal> findByMtlNo(String mtlno);
	
	MasterTransBrglokal findByMtlNoAndMtlType (String mtlno,String type);

}
