package com.invrepo.invrp.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.KoreksiHargaBahan;
import com.invrepo.invrp.models.KoreksiStock;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IKoreksiHrgBhnRepository extends JpaRepository<KoreksiHargaBahan,BigDecimal> {
	@Query(value = "SELECT * FROM KOREKSI_HARGA_BAHAN S WHERE TO_CHAR(KHB_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
	public List<KoreksiHargaBahan> getByKbhDate(String pdate);
	
	public List<KoreksiHargaBahan> findByKbhId(BigDecimal ksid);

}
