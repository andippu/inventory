package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DetilTransBrgpbrkCompKey implements Serializable {
	
	private String dtpMtpNo;
	private Date dtpMtpDate;
	private String dtpMtpType;
	private String dtpBrCode;
	private String dtpBatchNo;

}
