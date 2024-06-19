package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.VBelinoTtb;


@Repository
@CrossOrigin("http://localhost:4200")
public interface IVBelinoTtb extends JpaRepository <VBelinoTtb,String> {
	
	@Query(value = "SELECT * FROM V_BELINO_TTB S WHERE V_TTBBELITGL=?1",nativeQuery = true)
    public List<VBelinoTtb> getByTtbbeliTgl(String month);

}
