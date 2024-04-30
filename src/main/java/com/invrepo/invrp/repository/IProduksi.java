package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.Produksi;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IProduksi extends JpaRepository <Produksi,Integer>{
	
	@Query(value = "SELECT * FROM PRODUKSI S WHERE TO_CHAR(PR_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<Produksi> getPrByDay(String day);
	
	@Query(value = "SELECT * FROM PRODUKSI S WHERE TO_CHAR(PR_TGL_BATCH,'Monyyyy')=?1",nativeQuery = true)
    public List<Produksi> getPrByMonth(String month);
	
	@Query(value = "SELECT * FROM PRODUKSI S WHERE TO_CHAR(PR_TGL_BATCH,'dd/mm/yyyy')=?1 AND PR_NO_BATCH=?2",nativeQuery = true)
    public List<Produksi> getPrByNoBatchMonth(String month, String nobatch);
	
	Optional<Produksi> findByPrNoUrut(Integer nourut);

}
