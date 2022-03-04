package com.spring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Paises")
public class Paises {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_pais")
	private Long Id_Pais;

	@Column(name="nombre_pais")
	private String nombre_pais;
	
	public Paises(String nombre_pais) {
		super();
		this.nombre_pais = nombre_pais;
	}

	public Long getId_Pais() {
		return Id_Pais;
	}

	public Paises(Long id_Pais) {
		super();
		Id_Pais = id_Pais;
	}

	public void setId_Pais(Long id_Pais) {
		Id_Pais = id_Pais;
	}

	public String getNombre_pais() {
		return nombre_pais;
	}

	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}


	

}
