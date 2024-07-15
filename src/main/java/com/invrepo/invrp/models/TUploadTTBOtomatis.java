package com.invrepo.invrp.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TUP_TTB_OTOMATIS")
public class TUploadTTBOtomatis {
	@Id
    @Column(name="TUPTBOT_ID")
    private Integer tuptbotoId;	
	
	@Column(name="TUPTBOT_KB", length=100)
    private String tuptbotoKb;	
	
	@Column(name="TUPTBOT_KBNAME", length=100)
    private String tuptbotoKbName;	
	
	@Column(name="TUPTBOT_JB", length=100)
    private String tuptbotoJb;	
	
	@Column(name="TUPTBOT_NOPO", length=100)
    private String tuptbotoNoPo;	
	
	@Column(name="TUPTBOT_TGLTTB", length=100)
    private String tuptbotoTglTtb;
	
	@Column(name="TUPTBOT_NOTTB", length=100)
    private String tuptbotoNoTtb;

	@Column(name="TUPTBOT_QTY_PO", length=100)
    private String tuptbotoQtyPo;
	
	@Column(name="TUPTBOT_QTY", length=100)
    private String tuptbotoQty;
	
	@Column(name="TUPTBOT_SPL_CODE", length=100)
    private String tuptbotoSplCode;
	
	@Column(name="TUPTBOT_SUPPLIER", length=100)
    private String tuptbotoSupplier;
	
	@Column(name="TUPTBOT_KETERANGAN", length=100)
    private String tuptbotoKeterangan;
	
	@Column(name="TUPTBOT_HRG", length=100)
    private String tuptbotoHrg;
	
	@Column(name="TUPTBOT_TOTAL", length=100)
    private String tuptbotoTotal;
	
	@Column(name="TUPTBOT_ERR", length=100)
    private String tuptbotoErr;
	
}
