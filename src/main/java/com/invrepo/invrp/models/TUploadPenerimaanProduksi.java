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
@Table(name = "T_UPLOAD_PENERIMAAN_PRODUKSI")
public class TUploadPenerimaanProduksi {
	
	@Id
    @Column(name="TUPP_ID")
    private BigDecimal tuppId;
	
	
    @Column(name="NOBATCH",length=30, nullable = false)
    private String tuppNoBatch;
	
	
    @Column(name="KDBRG",length=10)
    private String tuppKdBrg;
	
	
    @Column(name="KDBHN",length=10)
    private String tuppKdBhn;
	
	
    @Column(name="NMBRG",length=80)
    private String tuppNmBrg;
    
    @Column(name="NMBHN",length=80)
    private String tuppNmBahan;
    
    @Column(name="QTYBATCH",length=10)
    private String tuppBatchQty;
    
    @Column(name="TGLPIC",length=20)
    private String tuppTglPIC;
    
    @Column(name="JB",length=3)
    private String tuppJB;
    
    @Column(name="QTYB",length=10)
    private String tuppQtyBahan;
    
    @Column(name="TIPE",length=3)
    private String tuppTipe;
    
    @Column(name="TGLINOUT",length=10)
    private String tuppTglInOut;
    
    @Column(name="KETERANGAN",length=200)
    private String tuppKeterangan;
    
    @Column(name="ERR",length=80)
    private String tuppError;

}
