package com.fatmanurguney.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatmanurguney.entities.Personel;
import com.fatmanurguney.repositories.PersonelRepository;

@Service
public class PersonelService {
	
	@Autowired
	private PersonelRepository personelRepository;
	
	public List<Personel> getAll(){
		return personelRepository.findAll();
	}
}
