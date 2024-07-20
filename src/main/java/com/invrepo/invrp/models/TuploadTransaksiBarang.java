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
@Table(name = "TUP_TRANSAKSI_BARANG")
public class TuploadTransaksiBarang {
	
	@Id
    @Column(name="NO_PK", length=30)
    private String tutbNoPk;	
	
	 @Column(name="TGL", length=15)
	    private String tutbTgl;	
	 
	 @Column(name="QTY", length=30)
	 private String tutbQty;	
	 
	 @Column(name="STN", length=30)
	 private String tutbStn;	
	 
	 @Column(name="KD_PROD", length=30)
	 private String tutbKdProd;	
	 
	 @Column(name="NO_BATCH", length=30)
	 private String tutbNoBatch;	
	 
	 @Column(name="TIPE", length=30)
	 private String tutbTipe;	
	 
	 @Column(name="PERIODE_BATCH", length=20)
	 private String tutbPeriodeBatch;	
	 
	 @Column(name="KETERANGAN", length=100)
	 private String tutbKeterangan;	


}
