package com.invrepo.invrp.models;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "KOREKSI_STOCK")
public class KoreksiStock {
	
	@Id
    @Column(name="KS_ID")
    private BigDecimal ksId;
	
	@Column(name="TGL")
	 @JsonFormat(pattern="dd-MM-yyyy")
    private Date ksDate;
	
	@Column(name="NO_KOREKSI",length=100)
	private String ksNoKoreksi;
	
	@Column(name="KODE_BAHAN",length=12)
	private String ksKodeBahan;
	
	@Column(name="QTY")
    private BigDecimal ksQty;
	
	@Column(name="JNS",length=1)
	private String ksJenis;
	
	@Column(name="INOUT",length=3)
	private String ksInOut;
	
}
