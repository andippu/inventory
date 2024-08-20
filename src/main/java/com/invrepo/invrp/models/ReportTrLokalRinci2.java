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
@Table(name= "RPT_TRLOKAL_RINCI2")
@IdClass(ReportTrLokalRinci2CompKey.class)
public class  ReportTrLokalRinci2{
	@Id
	@Column(name="RTLRC_BRCODE",length=6,  nullable = false)
	 private String rtlrcBrCode;
	
	@Id
	@Column(name="RTLRC_BATCHNO",length=12,  nullable = false)
	 private String rtlrcBatchNo;
	
	@Column(name="RTLRC_BRNAME",length=50)
	 private String rtlrcBrName;
	
	@Column(name="RTLRC_STOKAWAL")
	 private Integer rtlrcStockAwal;
	
	@Column(name="RTLRC_DATE",length=5)
	 private String rtlrcDate;
	
	@Column(name="RTLRC_PERIOD",length=7)
	 private String rtlrcPeriod;
	
	@Column(name="RTLRC_PERIODMONTH",length=8)
	 private String rtlrcPeriodMonth;
	
	@Column(name="RTLRC_DESC",length=50)
	 private String rtlrcDesc;
	
	@Column(name="RTLRC_NO",length=50)
	 private String rtlrcNo;
	
	@Column(name="RTLRC_NOSPB",length=50)
	 private String rtlrcNoSpb;
	
	@Column(name="RTLRC_QTY_IN")
	 private Integer rtlrcQtyIn;
	
	@Column(name="RTLRC_QTY_OUT")
	 private Integer rtlrcQtyOut;
	 

}
