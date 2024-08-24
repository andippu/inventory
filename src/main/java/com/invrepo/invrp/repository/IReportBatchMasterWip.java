package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.ReportBatchMasterWip;
import com.invrepo.invrp.models.ReportBatchMasterWipCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportBatchMasterWip  extends JpaRepository <ReportBatchMasterWip, ReportBatchMasterWipCompKey>{
	public List<ReportBatchMasterWip> findByRbmBrCodeContainingAndRbmPeriod (String brcode, String period);

}
