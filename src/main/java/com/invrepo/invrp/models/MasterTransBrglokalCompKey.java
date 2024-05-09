package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MasterTransBrglokalCompKey implements Serializable {
	
	private String mtlNo;
	private Date mtlDate;
	private String mtlType;

}
