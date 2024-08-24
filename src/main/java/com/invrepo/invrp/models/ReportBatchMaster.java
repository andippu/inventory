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
@Table(name= "RPT_BATCH_MASTER")
@IdClass(ReportBatchMasterCompKey.class)
public class ReportBatchMaster {
	
	@Id
	@Column(name="RBM_NOBATCH",length=12,  nullable = false)
	 private String rbmBatchNo;
	
	@Id
	@Column(name="RBM_TGLBATCH",length=10,  nullable = false)
	 private String rbmTglBatch;

	@Column(name="RBM_BRCODE",length=6)
	 private String rbmBrCode;
	
	@Column(name="RBM_BRNAME",length=50)
	 private String rbmBrName;
	
	@Column(name="RBM_SATDESC",length=10)
	 private String rbmSatDesc;
	
	@Column(name="RBM_UNIT")
	 private BigDecimal rbmUnit;
	
	@Column(name="RBM_HPPB")
	 private BigDecimal rbmHppb;
	
	@Column(name="RMB_HPPU")
	 private BigDecimal rbmHppu;
	
	@Column(name="RBM_DIBUAT",length=40)
	 private String rbmDibuat;
	
	@Column(name="RBM_DIPERIKSA",length=40)
	 private String rbmDiperiksa;
	
	@Column(name="RBM_DESCUNIT",length=26)
	 private String rbmDescUnit;
	
	@Column(name="RMB_PERIOD",length=6)
	 private String rbmPeriod;
		   

}
