package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.DetilTtbbeli;
import com.invrepo.invrp.models.DetilTtbbeliCompKey;

import jakarta.transaction.Transactional;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IDetilTtbbeli extends JpaRepository <DetilTtbbeli,DetilTtbbeliCompKey> {
	
	 List<DetilTtbbeli> findBydtlttbbeliNo(String belino);
	
	 DetilTtbbeli findBydtlttbbeliNoAndDtlttbbahancode(String belino,String code);
	 
	 @Transactional
	 @Modifying
	 @Query(value = "UPDATE DETIL_TTBBELI c SET c.DETIL_TTBBELI_NO = ?1, c.TTBBELI_BAHAN_CODE = ?2, c.TTBBELI_JNS_BAHAN = ?3, c.TTB_BELI_JUMLAH = ?4, c.TTB_HRG = ?5,"
				+ " c.TTB_GRANDTOTAL = ?6, c.TTBBELI_CREATED_BY = ?7, c.TTBBELI_CREATED_DATE = ?8 WHERE c.DETIL_TTBBELI_NO = ?9 AND c.TTBBELI_BAHAN_CODE = ?10" ,nativeQuery = true)
		int updateWithTtbelinoAndBhnCode(String dtlbelino, String dtlbahancode, String dtljnsbahan, String dtlbelijumlah, 
			String ttbharga,String ttbgrandtotal,String createby,String cretedate ,String Pdtlbelino, String pdtlbahancode);

}
