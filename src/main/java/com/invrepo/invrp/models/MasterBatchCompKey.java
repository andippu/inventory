package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MasterBatchCompKey implements Serializable{
	
	private String mbtNoBatch;
	private Date mbtTglBatch;

}