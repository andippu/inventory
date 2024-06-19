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
@Table(name = "DETIL_TTBBELI")
@IdClass(DetilTtbbeliCompKey.class)
public class DetilTtbbeli {
	
	@Id
    @Column(name="DETIL_TTBBELI_NO",length=50)
    private String dtlttbbeliNo;
	
	@Id
    @Column(name="TTBBELI_BAHAN_CODE",length=12)
    private String dtlttbbahancode;
	
    @Column(name="TTBBELI_JNS_BAHAN",length=3)
    private String dtlttbbeliJnsBahan;
    
    @Column(name="TTB_BELI_JUMLAH")
	private BigInteger dtlttbbeliJumlah;
	
	@Column(name="TTBBELI_CREATED_BY",length=20)
    private String dtlttbbeliCreatedBy;
	
	@Column (name="TTBBELI_CREATED_DATE")
    private Date dtlttbbeliCreatedDate;
	
	@Column(name="TTB_HRG")
	private BigInteger dtlttbHrg;
	
	@Column(name="TTB_KURS_CODE",length=2)
    private String dtlttbKursCode;
	
	@Column(name="TTB_TOTAL")
	private BigInteger dtlttbTotal;
	
	@Column(name="KURS_RATE")
	private BigInteger dtlttbKursRate;
	
	@Column(name="TTB_PPN")
	private BigInteger dtlttbPpn;
	
	@Column(name="TTB_GRANDTOTAL")
	private BigInteger dtlttbGrandtotal;
	
	@Column(name="TTB_BIAYAADMIN")
	private BigInteger dtlttbBiayadmin;
	
	@Column(name="GKG")
	private BigInteger dtlttbGkg;

}
