package com.invrepo.invrp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.MasterTtbbeli;
import com.invrepo.invrp.repository.IMasterTtbbeli;

@Service
public class ServiceMasterTtbbeli {
	
	@Autowired
	IMasterTtbbeli RepoMasbel;
	
	public List<MasterTtbbeli> getMasBelAll(){
		return RepoMasbel.findAll();
	}
	
	public List<MasterTtbbeli> getMasBelByDay(String day){
	       // System.out.println("test dt :"+dt);
	          return RepoMasbel.getMtByDay(day);
	}
	
	public List<MasterTtbbeli> getMasBelByMonth(String month){
	       // System.out.println("test dt :"+dt);
	          return RepoMasbel.getMtByMonth(month);
	}
	
	public List<MasterTtbbeli> getMasBelByBeliNoMonth(String month, String belino){
	       // System.out.println("test dt :"+dt);
	          return RepoMasbel.getMtByBeliNoMonth(month, belino);
	}
	
	public Optional<MasterTtbbeli> getBeliNo(String belino){
	       // System.out.println("test dt :"+dt);
	          return RepoMasbel.findByTtbbeliNo(belino);
	}
	
	public String saveUpdateMasterTtbbeli( MasterTtbbeli masbel) {
		RepoMasbel.save(masbel);
		return "Submit Successfully";
	}
	
	public String HitHargaSatuanTtba(){
		RepoMasbel.getHitSatuanTtba();		
		return "Hitung Harga Satuan Successfully";
	}

}
