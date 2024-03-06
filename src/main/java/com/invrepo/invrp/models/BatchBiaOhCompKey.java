package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatchBiaOhCompKey implements Serializable{
	
	private String bbohMbtNoBatch;
	private Date bbohMbtTglBatch;
	private Integer bbohSeq;

}
