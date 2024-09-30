package com.invrepo.invrp.services;


import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.invrepo.invrp.models.ReportBatchMaster;
import com.invrepo.invrp.models.ReportBatchMasterWip;
import com.invrepo.invrp.models.ReportRekapTTB;
import com.invrepo.invrp.models.ReportTrLokalRekap;
import com.invrepo.invrp.models.ReportTrLokalRekapPeriod;
import com.invrepo.invrp.models.ReportTrLokalRinci2;
import com.invrepo.invrp.models.ReportTrLokalRinci2Period;
import com.invrepo.invrp.repository.IReportBatchMaster;
import com.invrepo.invrp.repository.IReportBatchMasterWip;
import com.invrepo.invrp.repository.IReportRekapTTB;
import com.invrepo.invrp.repository.IReportTrLokalRekap;
import com.invrepo.invrp.repository.IReportTrLokalRekapPeriod;
import com.invrepo.invrp.repository.IReportTrLokalRinci2;
import com.invrepo.invrp.repository.IReportTrLokalRinci2Period;

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
	@Autowired
	IReportTrLokalRinci2Period repoRTLRCP;
	@Autowired
	IReportTrLokalRekap repoRTLKM;
	@Autowired
	IReportTrLokalRekapPeriod repoRTLKMP;
	@Autowired
	IReportBatchMaster repoRBM;
	@Autowired
	IReportBatchMasterWip repoRBMW;
	
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
	
	public void LapRekapRinci2Period(String period, String br1, String br2, String batch1, String batch2, HttpServletResponse response) throws JRException, IOException {
		List<ReportTrLokalRinci2Period> RTLRCP= repoRTLRCP.getRTLRCPList(period, br1, br2, batch1, batch2);
		File file = ResourceUtils.getFile("classpath:TRLOKAL_RINCI2.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RTLRCP);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("br1", br1);	
		parameters.put("br2", br2);	
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapTrLokalRekap(String period, String br1, String br2, String stb, HttpServletResponse response) throws JRException, IOException {
		List<ReportTrLokalRekap> RTLKM= repoRTLKM.getRTLKMList(period, br1, br2, stb);
		File file = ResourceUtils.getFile("classpath:TRLOKAL_REKAP.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RTLKM);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("br1", br1);	
		parameters.put("br2", br2);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapTrLokalRekapPeriod(String period, String br1, String br2, String stb, HttpServletResponse response) throws JRException, IOException {
		List<ReportTrLokalRekapPeriod> RTLKMP= repoRTLKMP.getRTLKMPList(period, br1, br2, stb);
		File file = ResourceUtils.getFile("classpath:TRLOKAL_REKAP_PERIOD.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RTLKMP);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("br1", br1);	
		parameters.put("br2", br2);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapMasterBatch(String brcode, String period, HttpServletResponse response) throws JRException, IOException {
		List<ReportBatchMaster> RBM= repoRBM.findByRbmBrCodeContainingAndRbmPeriod(brcode, period);
		File file = ResourceUtils.getFile("classpath:LAP_BATCH_MASTER.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RBM);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("brcode", brcode);	
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void LapMasterBatchWIP(String brcode, String period, HttpServletResponse response) throws JRException, IOException {
		List<ReportBatchMasterWip> RBMW= repoRBMW.findByRbmBrCodeContainingAndRbmPeriod(brcode, period);
		File file = ResourceUtils.getFile("classpath:LAP_BATCH_MASTER_WIP.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RBMW);		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("brcode", brcode);	
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public String runKartuBaku(String awal, String akhir) {
		return repoRBM.runKartuBaku(awal, akhir);
	}
	
	public String runKartuKemas(String awal, String akhir) {
		return repoRBM.runKartuKemas(awal, akhir);
	}
 
	public String runLapStockBaku(String awal, String akhir) {
		return repoRBM.runLapStockBaku(awal, akhir);
	}
	
	public String runLapStockKemas(String awal, String akhir) {
		return repoRBM.runLapStockKemas(awal, akhir);
	}
	
	public String runSetData(String akhir) {
		return repoRBM.runSetData(akhir);
	}
	
	public String runRevisiBatch(String akhir) {
		return repoRBM.runRevisiBatch(akhir);
	}
	
	public String runLapHPP(String akhir, BigDecimal biaya) {
		return repoRBM.runLapHPP(akhir, biaya);
	}
	
	public String runLapRendemen(String akhir) {
		return repoRBM.runLapRendemen(akhir);
	}
	

}
