package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.DetilTtbbeli;
import com.invrepo.invrp.models.DetilTtbbeliCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IDetilTtbbeli extends JpaRepository <DetilTtbbeli,DetilTtbbeliCompKey> {
	
	 List<DetilTtbbeli> findBydtlttbbeliNo(String belino);
	
	 DetilTtbbeli findBydtlttbbeliNoAndDtlttbbahancode(String belino,String code);

}
