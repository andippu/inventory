package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.TransBahan;


@Repository
@CrossOrigin("http://localhost:4200")
public interface ITransBahan extends JpaRepository <TransBahan,Integer> {
	
	@Query(value = "SELECT * FROM TRANS_BAHAN S WHERE S.TB_TYPE=?1 ORDER BY S.TB_TRANS_DATE,S.TB_BR_CODE,"
			+ "S.TB_BATCH_NO, S.TB_BAHAN_TYPE,S.TB_BAHAN_CODE , S.TB_NO_SERAH , S.TB_NONPROD_TYPE",nativeQuery = true)
    public List<TransBahan> getByTbType(String type);
	
	Optional<TransBahan> findBytrTbId(Integer tbid);
	
}
