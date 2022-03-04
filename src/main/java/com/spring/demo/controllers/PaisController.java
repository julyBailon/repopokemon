package com.spring.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.entity.Cuentas;
import com.spring.demo.entity.Paises;
import com.spring.demo.services.CuentaService;
import com.spring.demo.services.PaisService;

@RestController
@RequestMapping("/paises")
public class PaisController {
	PaisService paisService;
	
	public PaisController(PaisService paisService){
		this.paisService = paisService;
	}
	

	@GetMapping("nombre")
	private ResponseEntity<List<Paises>> getPaisesById(@PathVariable("nombre") String nombre){
		return ResponseEntity.ok(paisService.findPaisesById(nombre));
		
	}
	
}
