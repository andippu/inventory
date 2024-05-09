package com.invrepo.invrp.models;

import java.math.BigInteger;
import java.util.Date;

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
@Table(name = "DETIL_TTBBELI")

public class DetilTtbbeli {
	
	@Id
    @Column(name="DETIL_TTBBELI_NO",length=50)
    private String detilTtbbeliNo;
	
    @Column(name="TTBBELI_BAHAN_CODE",length=12)
    private String detilTtbbeliBahanCode;
	
    @Column(name="TTBBELI_JNS_BAHAN",length=3)
    private String detilTtbbeliJnsBahan;
    
    @Column(name="TTB_BELI_JUMLAH")
	private BigInteger detilTtbbeliJumlah;
	
	@Column(name="TTBBELI_CREATED_BY",length=20)
    private String detilTtbbeliCreatedBy;
	
	@Column (name="TTBBELI_CREATED_DATE")
    private Date detilTtbbeliCreatedDate;
	
	@Column(name="TTB_HRG")
	private BigInteger detilTtbbeliHrg;
	
	@Column(name="TTB_KURS_CODE",length=2)
    private String detilTtbbeliKursCode;
	
	@Column(name="TTB_TOTAL")
	private BigInteger detilTtbbeliTotal;
	
	@Column(name="KURS_RATE")
	private BigInteger detilTtbbeliKursRate;
	
	@Column(name="TTB_PPN")
	private BigInteger detilTtbbeliPpn;
	
	@Column(name="TTB_GRANDTOTAL")
	private BigInteger detilTtbbeliGrandtotal;
	
	@Column(name="TTB_BIAYAADMIN")
	private BigInteger detilTtbbeliBiayaadmin;
	
	@Column(name="GKG")
	private BigInteger detilTtbbeliGkg;

}
