package com.invrepo.invrp.services;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.invrepo.invrp.models.ReportRekapTTB;
import com.invrepo.invrp.models.ReportTrLokalRinci2;
import com.invrepo.invrp.repository.IReportRekapTTB;
import com.invrepo.invrp.repository.IReportTrLokalRinci2;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint; 
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

@Service
public class ServiceReportsRepInv {
	@Autowired
	IReportRekapTTB repoRRTTB;	
	@Autowired
	IReportTrLokalRinci2 repoRTLRC;
	
	public void LapRekapTTB(String period, HttpServletResponse response) throws JRException, IOException {
		List<ReportRekapTTB> RLBM= repoRRTTB.findByRrttbPeriodOrderByRrttbTtbDate(period);
		File file = ResourceUtils.getFile("classpath:LAP_REKAP_TTB.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RLBM);		
		Map<String, Object> parameters = new HashMap<>();		
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapRekapRinci2(String period, String br1, String br2, String batch1, String batch2, HttpServletResponse response) throws JRException, IOException {
		List<ReportTrLokalRinci2> RTLRC= repoRTLRC.getRTLRCList(period, br1, br2, batch1, batch2);
		File file = ResourceUtils.getFile("classpath:TRLOKAL_RINCI2.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RTLRC);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("br1", br1);	
		parameters.put("br2", br2);	
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
 
	

}
