package com.fatmanurguney.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatmanurguney.entities.Personel;

@Repository
public interface PersonelRepository extends JpaRepository<Personel,Integer>{
	
}
