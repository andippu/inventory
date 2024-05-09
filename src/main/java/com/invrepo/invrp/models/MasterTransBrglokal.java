package com.invrepo.invrp.models;

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
@Table(name = "MASTER_TRANS_BRGLOKAL")
@IdClass(MasterTransBrglokalCompKey.class)
public class MasterTransBrglokal {
	
	@Id
    @Column(name="MTL_NO",length=30, nullable = false)
    private String mtlNo;
	
	@Id
    @Column(name="MTL_DATE")
	private Date mtlDate;
	
	@Id
    @Column(name="MTL_TYPE",length=3)
    private String mtlType;
	
	@Column(name="MTL_DESC",length=100)
    private String mtlDesc;
	
	@Column(name="MTL_CHGUSER",length=40)
    private String mtlChguser;
	
	@Column (name="MTL_CHGDATE")
    private Date mtlChgdate;

}
