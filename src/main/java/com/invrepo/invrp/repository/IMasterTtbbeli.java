package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.MasterTtbbeli;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IMasterTtbbeli extends JpaRepository <MasterTtbbeli,Integer> {
	
	@Query(value = "SELECT * FROM MASTER_TTBBELI S WHERE TO_CHAR(TTBBELI_TGL,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<MasterTtbbeli> getMtByDay(String day);
	
	@Query(value = "SELECT * FROM MASTER_TTBBELI S WHERE TO_CHAR(TTBBELI_TGL,'Monyyyy')=?1",nativeQuery = true)
    public List<MasterTtbbeli> getMtByMonth(String month);
	
	@Query(value = "SELECT * FROM MASTER_TTBBELI S WHERE TO_CHAR(TTBBELI_TGL,'dd/mm/yyyy')=?1 AND TTBBELI_NO=?2",nativeQuery = true)
    public List<MasterTtbbeli> getMtByBeliNoMonth(String month, String belino);
	
	@Procedure(procedureName = "HIT_HRG_SATUAN_TTBA")
	public String getHitSatuanTtba();
	
	Optional<MasterTtbbeli> findByTtbbeliNo(String belino);

}
