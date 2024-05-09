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
@Table(name = "STOCK_LOKAL")
@IdClass(StockLokalCompKey.class)

public class StockLokal {
	
	@Id
    @Column(name="SL_BR_CODE",length=6, nullable = false)
    private String slBrCode;
	
	@Id
    @Column(name="SL_BATCH_NO",length=12)
    private String slBatchNo;
	
	@Column(name="SL_STOCK_AWAL")
	private BigInteger slStockAwal;
	
	@Column(name="SL_STOCK_AKHIR")
	private BigInteger slStockAkhir;
	
	@Column (name="SL_EXP_DATE")
    private Date slExpDate;
	
	@Column(name="SL_CHGUSER",length=40)
    private String slChguser;
	
	@Column (name="SL_CHGDATE")
    private Date slChgdate;
	
	@Column(name="SL_HARGA_HPP")
	private BigInteger slHargaHpp;

}
