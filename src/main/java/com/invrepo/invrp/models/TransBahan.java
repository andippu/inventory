package com.invrepo.invrp.models;

import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "TRANS_BAHAN")
public class TransBahan {
	
	@Id
    @Column(name="TB_ID" , nullable = false)
    private Integer trTbId;
    
	@Column (name="TB_TYPE" ,length=2)
    private String trTbType;
	
	@Column (name="TB_IN_OUT" ,length=3)
    private String trTbInOut;
	
	@Column (name="TB_DATE")
    private Date trTbDate;
	
	@Column (name="TB_TRANS_DATE")
    private Date trTbTransDate;
	
	@Column (name="TB_BR_CODE" ,length=6)
    private String trTbBrCode;
	
	@Column (name="TB_BAHAN_CODE" ,length=12)
    private String trTbBahanCode;
	
	@Column (name="TB_BAHAN_TYPE" ,length=1)
    private String trTbBahanType;
	
	@Column (name="TB_BATCH_NO" ,length=20)
    private String trTbBatchNo;
	
	@Column(name="TB_BATCH_QTY")
    private BigInteger trTbBatchQty;
	
	@Column (name="TB_DESC" ,length=200)
    private String trTbDesc;
	
	@Column (name="TB_NONPROD_TYPE" ,length=5)
    private String trTbNonprodType;
	
	@Column (name="TB_NO_SERAH" ,length=50)
    private String trTbNoSerah;
	
	@Column (name="TB_SPL_CODE" ,length=6)
    private String trTbSplCode;
	
	@Column (name="TB_NO_PO" ,length=50)
    private String trTbNoPo;
	
	@Column (name="TB_NO_TERIMA" ,length=50)
    private String trTbNoTerima;
	
	@Column (name="TB_FILE_NAME" ,length=100)
    private String trTbFileName;
	
	@Column(name="TB_QTY")
    private BigInteger trTbQty;
	
	@Column(name="TB_HRG")
    private BigInteger trTbHrg;
	
	@Column(name="TB_TOTAL")
    private BigInteger trTbTotal;

}
