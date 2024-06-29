package com.fatmanurguney.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Autority {
	@Id
	private int id;
	private String yetki;
}
