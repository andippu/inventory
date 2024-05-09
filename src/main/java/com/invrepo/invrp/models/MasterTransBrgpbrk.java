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
@Table(name = "MASTER_TRANS_BRGPBRK")
@IdClass(MasterTransBrgpbrkCompKey.class)
public class MasterTransBrgpbrk {
	
	@Id
    @Column(name="MTP_NO",length=100, nullable = false)
    private String mtpNo;
	
	@Id
    @Column(name="MTP_DATE")
	private Date mtpDate;
	
	@Id
    @Column(name="MTP_TYPE",length=3)
    private String mtpType;
	
	@Column(name="MTP_STATUS",length=1)
    private String mtpStatus;
	
	@Column(name="MTP_DESC",length=100)
    private String mtpDesc;
	
	@Column(name="MTP_CHGUSER",length=40)
    private String mtpChguser;
	
	@Column (name="MTP_CHGDATE")
    private Date mtpChgdate;

}
