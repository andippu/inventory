package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MasterTransBrgpbrkCompKey implements Serializable {
	
	private String mtpNo;
	private Date mtpDate;
	private String mtpType;

}
