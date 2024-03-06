package com.invrepo.invrp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.invrepo.invrp.models.Produksi;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IProduksi extends JpaRepository <Produksi,Integer>{

}
