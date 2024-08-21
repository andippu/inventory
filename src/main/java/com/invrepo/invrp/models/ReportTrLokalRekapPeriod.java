package com.invrepo.invrp.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "RPT_TRLOKAL_REKAPPERIOD_MST")
public class ReportTrLokalRekapPeriod {
	@Id
	@Column(name="RTLKM_BRCODE",length=6,  nullable = false)
	 private String rtlkmBrCode;
		
	@Column(name="RTLKM_BRNAME",length=50)
	 private String rtlkmBrName;
	
	@Column(name="RTLKM_PERIOD",length=7)
	 private String rtlkmPeriod;
	
	@Column(name="RTLKM_JBDESC",length=50)
	 private String rtlkmJbdesc;
	
	@Column(name="RTLKM_STBCODE",length=5)
	 private String rtlkmStbCode;
	
	@Column(name="RTLKM_STBDESC",length=50)
	 private String rtlkmStbDesc;
	
	@Column(name="RTLKM_PERIODMONTH",length=10)
	 private String rtlkmPeriodMonth;	

}
