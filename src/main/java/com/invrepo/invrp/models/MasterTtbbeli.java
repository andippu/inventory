package com.invrepo.invrp.models;

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
@Table(name = "MASTER_TTBBELI")

public class MasterTtbbeli {
	
	@Id
    @Column(name="TTBBELI_NO",length=50, nullable = false)
    private String ttbbeliNo;
	
    @Column(name="TTBBELI_TGL")
	private Date ttbbeliTgl;
	
    @Column(name="TTBBELI_SPL_CODE",length=6)
    private String ttbbeliSplCode;
	
	@Column(name="TTBBELI_NOPO",length=50)
    private String ttbbeliNopo;
	
	@Column(name="TTBBELI_CREATED_BY",length=50)
    private String ttbbeliCreatedBy;
	
	@Column (name="TTBBELI_CREATED_DATE")
    private Date ttbbeliCreatedDate;

}
