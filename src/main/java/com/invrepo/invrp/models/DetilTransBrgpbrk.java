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
@Table(name = "DETIL_TRANS_BRGPBRK")
@IdClass(DetilTransBrgpbrkCompKey.class)

public class DetilTransBrgpbrk {
	
	@Id
    @Column(name="DTP_MTP_NO",length=30, nullable = false)
    private String dtpMtpNo;
	
	@Id
    @Column(name="DTP_MTP_DATE")
	private Date dtpMtpDate;
	
	@Id
    @Column(name="DTP_MTP_TYPE",length=3)
    private String dtpMtpType;
	
	@Id
    @Column(name="DTP_BR_CODE",length=6)
    private String dtpBrCode;
	
	@Id
    @Column(name="DTP_BATCH_NO",length=12)
    private String dtpBatchNo;
	
	@Column(name="DTP_QTY")
	private BigInteger dtpQty;
	
	@Column(name="DTP_CHGUSER",length=40)
    private String dtpChguser;
	
	@Column (name="DTP_CHGDATE")
    private Date dtpChgdate;
	
	@Column(name="DTP_MTP_STATUS",length=1)
    private String dtpMtpStatus;
	
	@Column(name="DTP_BATCH_PERIOD",length=20)
    private String dtpBatchPeriod;

}
