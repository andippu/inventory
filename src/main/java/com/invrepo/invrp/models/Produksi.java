package com.invrepo.invrp.models;

import java.sql.Date;

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
@Table(name= "PRODUKSI")
public class Produksi {
	
	@Id
    @Column(name="PR_NO_URUT" , nullable = false)
    private Integer prNoUrut;
    
	@Column (name="PR_NO_BATCH" ,length=12)
    private String prNoBatch;
	
	@Column (name="PR_TGL_BATCH")
    private Date prTglBatch;
	
	@Column (name="KEGIATAN" ,length=50)
    private String prKegiatan;
	
	@Column(name="PR_MANHOUR")
    private Integer prManhour;
	
	@Column(name="PR_NO")
    private Integer prNo;

}
