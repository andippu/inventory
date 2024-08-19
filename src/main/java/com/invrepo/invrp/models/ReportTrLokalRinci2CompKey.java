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

public class ReportTrLokalRinci2CompKey implements Serializable {
	 private String rtlrcBrCode;
	 private String rtlrcBatchNo;
}
