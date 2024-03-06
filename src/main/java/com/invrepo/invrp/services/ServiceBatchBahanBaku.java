package com.invrepo.invrp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invrepo.invrp.models.BatchBahanBaku;
import com.invrepo.invrp.repository.IBatchBahanBaku;

//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Service
public class ServiceBatchBahanBaku {
	
	@Autowired
	IBatchBahanBaku RepoSBBBaku;
	public List<BatchBahanBaku> getBahanBakuAll(){
		return RepoSBBBaku.findAll();
    }

}
