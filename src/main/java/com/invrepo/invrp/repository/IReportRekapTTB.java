package com.invrepo.invrp.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.Produksi;
import com.invrepo.invrp.models.ReportRekapTTB;
import com.invrepo.invrp.models.ReportRekapTTBCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportRekapTTB extends JpaRepository <ReportRekapTTB, ReportRekapTTBCompKey>{
	public List<ReportRekapTTB> findByRrttbPeriodOrderByRrttbTtbDate(String period);
}
