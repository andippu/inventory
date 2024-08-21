package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.ReportTrLokalRekapPeriod;



@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportTrLokalRekapPeriod extends JpaRepository <ReportTrLokalRekapPeriod, String> {
	@Query(value = "SELECT * FROM RPT_TRLOKAL_REKAPPERIOD_MST S WHERE RTLKM_PERIOD=?1 AND (RTLKM_BRCODE BETWEEN ?2 AND ?3) AND RTLKM_STBCODE=?4 ",nativeQuery = true)
	   public List<ReportTrLokalRekapPeriod> getRTLKMPList (String period, String br1, String br2, String stb);
}