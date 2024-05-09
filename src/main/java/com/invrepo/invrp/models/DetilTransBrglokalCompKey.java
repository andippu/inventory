package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DetilTransBrglokalCompKey implements Serializable {
	
	private String dtlMtlNo;
	private Date dtlMtlDate;
	private String dtlMtlType;
	private String dtlBrCode;
	private String dtlBatchNo;

}
