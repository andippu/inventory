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
@Table(name = "TUP_VALIDASI_PRODUKJADI")
public class TUploadValProdJadiHo {
	@Id
    @Column(name="TUVPJ_ID")
    private Integer tuvpjId;
	
	@Column(name="TUVPJ_PERIODE",length=15)
    private String tuvpjIdperiod;	
	
	@Column(name="TUVPJ_BRCODE",length=15)
    private String tuvpjBrCode;	
	
	@Column(name="TUVPJ_BATCHNO",length=30)
    private String tuvpjBatchNo;	
	
	@Column(name="TUVPJ_QTY",length=30)
    private String tuvpjQty;	

}
