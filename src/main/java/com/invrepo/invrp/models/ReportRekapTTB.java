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
@Table(name= "RPT_REKAP_TTB")
@IdClass(ReportRekapTTBCompKey.class)
public class ReportRekapTTB {
	@Id
	@Column(name="RRTTB_NOPO",length=40,  nullable = false)
	 private String rrttbNopo;
	
	@Id
	@Column(name="RRTTB_NOTTB",length=40,  nullable = false)
	 private String rrttbNoTtb;
	
	@Id
	@Column(name="RRTTB_BAHANCODE",length=12,  nullable = false)
	 private String rrttbBahanCode;
	
	@Column(name="RRTTB_SUPPLIER",length=120)
	 private String rrttbSupplier;
	
	@Column(name="RRTTB_TGLTTB",length=10)
	 private String rrttbTtbDate;
	
	@Column(name="RRTTB_PERIODE",length=10)
	 private String rrttbPeriod;
	
	@Column(name="RRTTB_JNSBHN",length=3)
	 private String rrttbJnsBahan;
	
	@Column(name="RRTTB_BTF",length=1)
	 private String rrttbBtf;
	
	@Column(name="RRTTB_FISIK",length=1)
	 private String rrttbFisik;
	
	@Column(name="RRTTB_QTY")
	 private BigDecimal rrttbQty;
	
	@Column(name="RRTTB_PRICE")
	 private BigDecimal rrttbPrice;
	
	@Column(name="RRTTB_TOTAL")
	 private BigDecimal rrttbTotal;	
	
}
