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

import com.invrepo.invrp.models.TUploadValProdJadiHo;

import jakarta.transaction.Transactional;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ITUploadValProdJadiHo extends JpaRepository <TUploadValProdJadiHo, Integer> {
	
	@Procedure(procedureName = "P_CSV_VALPRODJADIHO")
	public String exeValProdJadiHOGetCsv();

}
