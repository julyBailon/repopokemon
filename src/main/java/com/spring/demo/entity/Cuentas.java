package com.spring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Cuentas")
public class Cuentas {

	//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="Id_cuenta")
	private Long numcuenta;



	@Column(name="nombre_cuenta")
	private String nombre_cuenta;
	
	

	public Long getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(Long numcuenta) {
		this.numcuenta = numcuenta;
	}

	public String getNombre_cuenta() {
		return nombre_cuenta;
	}

	public void setNombre_cuenta(String nombre_cuenta) {
		this.nombre_cuenta = nombre_cuenta;
	}

	
	
}
