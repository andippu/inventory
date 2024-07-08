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
@Table(name = "TUP_PENERIMAAN_NONPRODUKSI")
public class TUploadPenerimaanNonProduksi {
	
	@Id
    @Column(name="TUPNP_ID")
    private BigDecimal tupnpId;
	
	@Column(name="KDBHN",length=20)
    private String tupnpKdBahan;
	
	@Column(name="NMBHN",length=20)
    private String tupnpNmBahan;
	
	@Column(name="JB",length=3)
    private String tupnpJB;
	
	@Column(name="NOSERAH",length=20)
    private String tupnpNoSerah;
	
	@Column(name="MI_REALDATE",length=20)
    private String tupnpRealDate;
	
	@Column(name="QTY",length=10)
    private String tupnpQty;
	
	@Column(name="INOUT",length=3)
    private String tupnpInOut;
	
	@Column(name="KETERANGAN",length=100)
    private String tupnpKeterangan;
	
	@Column(name="RINCIAN_KETERANGAN",length=3)
    private String tupnpRincianKet;
	
	@Column(name="ERR",length=80)
    private String tupnpError;
	


}
