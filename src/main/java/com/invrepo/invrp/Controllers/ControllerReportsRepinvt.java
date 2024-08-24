package com.invrepo.invrp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invrepo.invrp.models.ReportTrLokalRinci2;
import com.invrepo.invrp.services.ServiceReportsRepInv;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin("http://localhost:4200")
public class ControllerReportsRepinvt {
	@Autowired
	ServiceReportsRepInv servRRTTB;

	
	 @GetMapping("/pdf/reporLapRekapTtb")
	 public void createPDF(String period, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Rekap TTB " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRTTB.LapRekapTTB(period, response);
	    }
	 
	 @GetMapping("/pdf/reportTrLokalRincidua")
	 public void TrLokalRinci2PDF(String period, String br1, String br2, String batch1, String batch2, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Trlokal Rinci2 " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRTTB.LapRekapRinci2(period, br1, br2, batch1, batch2, response);
	    }
	 
	 @GetMapping("/pdf/reportTrLokalRinciduaperiod")
	 public void TrLokalRinci2PeriodPDF(String period, String br1, String br2, String batch1, String batch2, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Trlokal Rinci2 By Period " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRTTB.LapRekapRinci2Period(period, br1, br2, batch1, batch2, response);
	    }
	 
	 @GetMapping("/pdf/reportTrLokalRekap")
	 public void TrLokalRekapPDF(String period, String br1, String br2, String stb, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Trlokal Rekap " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRTTB.LapTrLokalRekap(period, br1, br2, stb, response);
	    }
	 
	 @GetMapping("/pdf/reportTrLokalRekapPeriod")
	 public void TrLokalRekapPeriodPDF(String period, String br1, String br2, String stb, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Trlokal Rekap By Period " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRTTB.LapTrLokalRekapPeriod(period, br1, br2, stb, response);
	    }
	 
	 @GetMapping("/pdf/reportMasterBatch")
	 public void MasterBatchPDF(String brcode, String period, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Trlokal Rekap By Period " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRTTB.LapMasterBatch(brcode, period, response);
	    }
	 
	 @GetMapping("/pdf/reportMasterBatchWip")
	 public void MasterBatchWipPDF(String brcode, String period, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Trlokal Rekap By Period " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRRTTB.LapMasterBatchWIP(brcode, period, response);
	    }
	 
	

}
