package com.invrepo.invrp.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class StockLokalCompKey implements Serializable {
	
	private String slBrCode;
	private String slBatchNo;

}
