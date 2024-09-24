package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.ReportBatchMaster;
import com.invrepo.invrp.models.ReportBatchMasterCompKey;


@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportBatchMaster  extends JpaRepository <ReportBatchMaster, ReportBatchMasterCompKey>{
	public List<ReportBatchMaster> findByRbmBrCodeContainingAndRbmPeriod (String brcode, String period);
	
	@Procedure(procedureName = "GET_EXCEL_BAKU")
	String runKartuBaku(String awal, String akhir);
	
	@Procedure(procedureName = "GET_EXCEL_KEMAS")
	String runKartuKemas(String awal, String akhir);
	
	
}
