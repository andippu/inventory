package com.invrepo.invrp.models;


import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MASTER_BATCH")
@IdClass(MasterBatchCompKey.class)
public class MasterBatch {
	
	@Id
    @Column(name="MBT_NO_BATCH",length=12, nullable = false)
    private String mbtNoBatch;
	
	@Id
    @Column(name="MBT_TGL_BATCH")
	private Date mbtTglBatch;
	
	@Column(name="MBT_BR_CODE",length=6)
    private String mbtBrCode;
	
	@Column(name="MBT_UNIT_BATCH")
	private Integer mbtUnitBatch;
	
	@Column(name="MBT_SAT_CODE",length=4)
    private String mbtSatCode;
	
	@Column(name="MBT_HPPB")
	private Integer mbtHppb;
	
	@Column(name="MBT_HPPU")
	private Integer mbtHppu;
	
	@Column(name="MBT_CHGUSER",length=40)
    private String mbtChguser;
	
	@Column (name="MBT_CHGDATE")
    private Date mbtChgdate;
	
	@Column(name="MBT_DIBUAT",length=40)
    private String mbtDibuat;
	
	@Column(name="MBT_DIPERIKSA",length=40)
    private String mbtDiperiksa;
	
	@Column(name="MBT_SELESAI",length=1)
    private String mbtSelesai;
	
	@Column (name="MBT_TGL_SELESAI")
    private Date mbtTglSelesai;

}

