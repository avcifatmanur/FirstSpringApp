package com.fatmanurguney.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatmanurguney.entities.Autority;
import com.fatmanurguney.repositories.AutorityRepository;

@Service
public class AutorityService {
	@Autowired
	private AutorityRepository autorityRepository;
	
	public List<Autority> getAll(){
		return autorityRepository.findAll();
	}
}
