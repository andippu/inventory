package com.invrepo.invrp.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TUP_VALIDASI_BHN_PABRIKHO")
public class TUploadValBhnPbHo {
	
	@Id
    @Column(name="TUVBPH_ID")
    private BigDecimal tuvbphId;	
	
	@Column(name="TUVBPH_PERIODE",length=20)
    private String tuvbphperiod;	
	
	@Column(name="TUVBPH_KDBAHAN",length=20)
    private String tuvbphKdbahan;	
	
	@Column(name="TUVBPH_NAMABAHAN",length=80)
    private String tuvbphNamaBahan;	
	
	@Column(name="TUVBPH_JB",length=20)
    private String tuvbphJb;	
	
	@Column(name="TUVBPH_QTY",length=20)
    private String tuvbphQty;	
	
	@Column(name="TUVBPH_PABRIKQTY",length=20)
    private String tuvbphPbrkQty;	
	
	@Column(name="TUVBPH_HOQTY",length=20)
    private String tuvbphHoQty;	
	
	@Column(name="TUVBPH_STATUS",length=30)
    private String tuvbphStatus;	
	
	@Column(name="TUVBPH_ERR",length=100)
    private String tuvbphError;
}
