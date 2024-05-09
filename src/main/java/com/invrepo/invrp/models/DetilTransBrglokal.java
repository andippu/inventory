package com.invrepo.invrp.models;

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
@Table(name = "DETIL_TRANS_BRGLOKAL")
@IdClass(DetilTransBrglokalCompKey.class)

public class DetilTransBrglokal {
	
	@Id
    @Column(name="DTL_MTL_NO",length=30, nullable = false)
    private String dtlMtlNo;
	
	@Id
    @Column(name="DTL_MTL_DATE")
	private Date dtlMtlDate;
	
	@Id
    @Column(name="DTL_MTL_TYPE",length=3)
    private String dtlMtlType;
	
	@Id
    @Column(name="DTL_BR_CODE",length=6)
    private String dtlBrCode;
	
	@Id
    @Column(name="DTL_BATCH_NO",length=18)
    private String dtlBatchNo;
	
	@Column (name="DTL_EXP_DATE")
    private Date dtlExpDate;
	
	@Column(name="DTL_QTY")
	private BigInteger dtlQty;
	
	@Column(name="DTL_CHGUSER",length=40)
    private String dtlChguser;
	
	@Column (name="DTL_CHGDATE")
    private Date dtlChgdate;

}
