package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatchBahanKemasCompKey implements Serializable{
	
	private String bbkMbtNoBatch;
	private Date bbkMbtTglBatch;
	private String bbkBkCode;

}
