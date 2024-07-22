package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.invrepo.invrp.models.TuploadTransaksiBarang;
import com.invrepo.invrp.repository.ITuploadTransaksiBarang;




@Service
public class ServiceTuploadTransaksiBarang {
	@Autowired
	ITuploadTransaksiBarang repoTB;
	
	public List<TuploadTransaksiBarang> getTransBrgList(){
		return repoTB.findAll();
	}
	
	public String exeTB1BpHpCsv() {
		return repoTB.exeProsesCsvTb1();
	}
	
	public String exeTB2SpbSelainCsv() {
		return repoTB.exeProsesCsvTb2();
	}
	
	public String exeProcessTransBrg(String RT, String TIPE , String STAT) {
		return repoTB.exeProsesTransBrg(RT, TIPE, STAT);
	}
}
