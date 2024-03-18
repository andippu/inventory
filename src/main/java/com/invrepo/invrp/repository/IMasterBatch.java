package com.invrepo.invrp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.MasterBatch;
import com.invrepo.invrp.models.MasterBatchCompKey;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IMasterBatch extends JpaRepository<MasterBatch,MasterBatchCompKey> {
	
	@Query(value = "SELECT * FROM MASTER_BATCH S WHERE TO_CHAR(MBT_TGL_BATCH,'Mon dd yyyy')=?1",nativeQuery = true)
    public List<MasterBatch> getMbtByDay(String day);
	
	@Query(value = "SELECT * FROM MASTER_BATCH S WHERE TO_CHAR(MBT_TGL_BATCH,'Monyyyy')=?1",nativeQuery = true)
    public List<MasterBatch> getMbtByMonth(String month);
	
	Optional<MasterBatch> findByMbtNoBatch(String nobatch);

}
