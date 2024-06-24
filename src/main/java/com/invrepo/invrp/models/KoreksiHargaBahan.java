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
@Table(name = "KOREKSI_HARGA_BAHAN")
public class KoreksiHargaBahan {
	
	@Id
    @Column(name="KHB_ID")
    private BigDecimal kbhId;
	
	@Column(name="KHB_DATE")
	 @JsonFormat(pattern="dd-MM-yyyy")
    private Date kbhDate;
	
	@Column(name="KHB_HARGA")
    private BigDecimal kbhHarga;
	
	@Column(name="KHB_KETERANGAN",length=200)
	private String kbhKeterangan;
	
	@Column(name="KHB_BAHAN",length=20)
	private String kbhBahan;
	
	@Column(name="TIPE_B",length=1)
	private String kbhTipe;
	
	@Column(name="IN_OUT",length=3)
	private String kbhInOut;

}
