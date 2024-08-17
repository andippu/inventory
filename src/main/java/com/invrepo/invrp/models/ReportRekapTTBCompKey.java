package com.invrepo.invrp.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ReportRekapTTBCompKey implements Serializable{
	 private String rrttbNopo;
	 private String rrttbNoTtb;
	 private String rrttbBahanCode;
}
