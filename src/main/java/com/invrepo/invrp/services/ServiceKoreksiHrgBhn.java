package com.invrepo.invrp.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.KoreksiHargaBahan;
import com.invrepo.invrp.repository.IKoreksiHrgBhnRepository;


@Service
public class ServiceKoreksiHrgBhn {
	@Autowired
	IKoreksiHrgBhnRepository repoKHB;
	
	public List<KoreksiHargaBahan> getKoreksiHrgBahan(Date pdate){
		return repoKHB.findByKbhDate(pdate);
	}

	public List<KoreksiHargaBahan> getKoreksiHrgBahanCU(BigDecimal ksid){
		return repoKHB.findByKbhId(ksid);
	}
	
	public String saveUpdKoreksiHrgBhn(KoreksiHargaBahan kbh) {
		repoKHB.save(kbh);
		return "Submit Successfully";
	}

}
