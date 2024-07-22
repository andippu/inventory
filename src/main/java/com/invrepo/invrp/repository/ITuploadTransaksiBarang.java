package com.invrepo.invrp.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.TuploadTransaksiBarang;


@Repository
@CrossOrigin("http://localhost:4200")
public interface ITuploadTransaksiBarang  extends JpaRepository <TuploadTransaksiBarang, String> {
	
	@Procedure(procedureName = "P_CSV_TB1BPHP")
	public String exeProsesCsvTb1();
	
	@Procedure(procedureName = "P_CSV_TB2SPBSELAIN")
	public String exeProsesCsvTb2();
	
	@Procedure(procedureName = "P_UPLOADTRANSAKSI_BARANG")
	public String exeProsesTransBrg(String RT, String TIPE , String STAT);
	
	

}

