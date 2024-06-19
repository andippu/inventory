package com.invrepo.invrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.VNoTtb;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVNoTtb extends JpaRepository <VNoTtb,String> {
	
	@Query(value = "SELECT * FROM V_NO_TTB S WHERE V_DATE_TTBA=?1",nativeQuery = true)
    public List<VNoTtb> getByTtbaTgl(String month);

}
