package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.entity.Cuentas;


public interface CuentaRepoitory  extends JpaRepository<Cuentas, String>{
	public Cuentas findByNumcuenta(Long numcuenta);

}
