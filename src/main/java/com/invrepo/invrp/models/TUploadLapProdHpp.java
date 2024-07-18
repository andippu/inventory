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
@Table(name = "LAP_PRODUKSI_HPP")
public class TUploadLapProdHpp {
	
	@Id
    @Column(name="NO_PPK", length =200)
    private String tuplphPPkNo;
	
	 @Column(name="PERIODE", length =7)
	    private String tuplphPeriode;
	 
	 @Column(name="PRODUK", length =200)
	    private String tuplphProduct;
	 
	 @Column(name="BATCH", length =20)
	    private String tuplphBatch;
	 
	 @Column(name="OUTPUT_STD")
	    private Integer tuplphOutputStd;
	 
	 @Column(name="OUTPUT_NYATA")
	    private Integer tuplphOutpuNyata;
	 
	 @Column(name="MAN_PROSES_STD")
	    private Integer tuplphManProsesStd;
	 
	 @Column(name="MAN_KEMAS_STD")
	    private Integer tuplphManKemasStd;
	 
	 @Column(name="MAN_PROSES")
	    private Integer tuplphManProses;
	 
	 @Column(name="MAN_KEMAS")
	    private Integer tuplphManKemas;
	 
	 @Column(name="REN_STD")
	    private Integer tuplphRenStd;
	 
	 @Column(name="REN_NYATA")
	    private Integer tuplphRenNyata;
	 
	 @Column(name="KATEGORI", length =100)
	    private String tuplphKategori;
	 
	 @Column(name="KODE_PRODUK", length =40)
	    private String tuplphKdProduk;
	   

}
