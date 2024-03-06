package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatchBahanBakuCompKey implements Serializable{
	
	private String bbbMbtNoBatch;
	private Date bbbMbtTglBatch;
	private String bbbBbCode;

}
