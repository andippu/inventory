package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.ReportTrLokalRinci2;
import com.invrepo.invrp.models.ReportTrLokalRinci2Period;
import com.invrepo.invrp.models.ReportTrLokalRinci2PeriodCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportTrLokalRinci2Period extends JpaRepository <ReportTrLokalRinci2Period,ReportTrLokalRinci2PeriodCompKey> {
	@Query(value = "SELECT * FROM RPT_TRLOKAL_RINCI2_PERIOD S WHERE RTLRC_PERIOD=?1 AND (RTLRC_BRCODE BETWEEN ?2 AND ?3) AND (RTLRC_BATCHNO BETWEEN nvl(?4,'%') AND nvl(?5,'%')) ",nativeQuery = true)
	public List<ReportTrLokalRinci2Period> getRTLRCPList (String period, String br1, String br2, String batch1, String batch2);

}
