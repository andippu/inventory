package com.invrepo.invrp.models;

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
@Table(name = "BATCH_BAHAN_KEMAS")
@IdClass(BatchBahanKemasCompKey.class)
public class BatchBahanKemas {
	
	@Id
    @Column(name="BBK_MBT_NO_BATCH",length=12, nullable = false)
    private String bbkMbtNoBatch;
	
	@Id
    @Column(name="BBK_MBT_TGL_BATCH")
	private Date bbkMbtTglBatch;
	
	@Id
    @Column(name="BBK_BK_CODE",length=12)
    private String bbkBkCode;
	
	@Column(name="BBK_NO")
	private Integer bbkBkNo;
	
	@Column(name="BBK_UNIT")
	private Integer bbkUnit;
	
	@Column(name="BBK_SAT_CODE",length=4)
    private String bbkSatCode;
	
	@Column(name="BBK_HARGA_SAT")
	private Integer bbkHargaSat;
	
	@Column(name="BBK_TOTAL")
	private Integer bbkTotal;
	
	@Column(name="BBK_CHGUSER",length=40)
    private String bbkChguser;
	
	@Column (name="BBK_CHGDATE")
    private Date bbkChgdate;

}
