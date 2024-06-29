package com.fatmanurguney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatmanurguney.entities.Autority;

@Repository
public interface AutorityRepository extends JpaRepository<Autority, Integer>{
	

}
