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
@Table(name = "BATCH_BIA_OH")
@IdClass(BatchBiaOhCompKey.class)
public class BatchBiaOh {
	
	@Id
    @Column(name="BBOH_MBT_NO_BATCH",length=12, nullable = false)
    private String bbohMbtNoBatch;
	
	@Id
    @Column(name="BBOH_MBT_TGL_BATCH")
	private Date bbohMbtTglBatch;
	
	@Id
    @Column(name="BBOH_SEQ")
    private Integer bbohSeq;
	
	@Column(name="BBOH_DESC",length=200)
    private String bbohDesc;
	
    @Column(name="BBOH_TGL")
	private Date bbohTgl;
	
	@Column(name="BBOH_VALUE")
	private BigInteger bbohValue;
	
	@Column(name="BBOH_BOP")
	private BigInteger bbohBop;
	
	@Column(name="BBOH_TOTAL")
	private BigInteger bbohTotal;
	
	@Column(name="BBOH_CHGUSER",length=40)
    private String bbohChguser;
	
	@Column (name="BBOH_CHGDATE")
    private Date bbohChgdate;
	
	@Column(name="BBOH_NO_PPK",length=40)
    private String bbohNoPpk;

}
