package com.invrepo.invrp.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.KoreksiStock;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IKoreksiStockRepository extends JpaRepository<KoreksiStock, BigDecimal>{
	
	public List<KoreksiStock> findByKsDate(Date pdate);
	
	public List<KoreksiStock> findByKsId(BigDecimal ksid);

}
