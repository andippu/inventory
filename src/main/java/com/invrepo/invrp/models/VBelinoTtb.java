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
@Table(name = "V_BELINO_TTB")
public class VBelinoTtb {
	
	@Id
    @Column(name = "V_TTBBELI_NO", length = 50)
    private String vttbbelino;

    @Column(name = "V_TTBBELITGL", length = 10)
    private String vttbbelitgl;

}
