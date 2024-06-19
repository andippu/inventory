package com.invrepo.invrp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_NO_TTB")
public class VNoTtb {
	
	@Id
    @Column(name = "V_NO_TTBA", length = 50)
    private String vnottba;

    @Column(name = "V_DATE_TTBA", length = 10)
    private String vdatettba;

}
