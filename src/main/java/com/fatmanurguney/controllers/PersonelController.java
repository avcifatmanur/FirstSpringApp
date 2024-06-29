package com.fatmanurguney.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.fatmanurguney.entities.Personel;
import com.fatmanurguney.services.PersonelService;

@Controller
public class PersonelController {
	
	@Autowired
	private PersonelService personelService;
	
	@PostMapping("/personeller")
	public String getPersoneller(Model model) {
		List<Personel> personelListesi=personelService.getAll();
		model.addAttribute("liste",personelListesi);
		return "personelPage";
		
	}
}
