package com.fatmanurguney.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Personel {
	@Id
	private int id;
	private String adi;
	private String soyadi;
	@Override
	public String toString() {
		return "Personel [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	
}
