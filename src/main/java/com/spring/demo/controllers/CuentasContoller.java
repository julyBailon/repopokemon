package com.spring.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.entity.Cuentas;
import com.spring.demo.services.CuentaService;


@RestController
@RequestMapping ("/cuentas")
public class CuentasContoller {
	CuentaService cuentaService;
	
	public CuentasContoller(CuentaService cuentaService){
		this.cuentaService = cuentaService;
	}
	
	@GetMapping(value="/abilities")
	public String obtenerAbilities(@PathVariable("nombrePokemon") String pokemon) {
		return cuentaService.obtenerAbilities(pokemon);
	}
	
	
	@GetMapping(value = "")
	public List<Cuentas> consultaCuentas(){
		return cuentaService.consultarCuentas();
	}
	

	@GetMapping("id")
	private ResponseEntity<List<Cuentas>> getallCuentasbyId(@PathVariable("id") long idCuenta){
		return ResponseEntity.ok(cuentaService.findallbyCuenta(idCuenta));
		
	}
	
	@PostMapping("")
	public void registroCuenta(@RequestBody Cuentas cuenta) {
		cuentaService.guardar(cuenta);
	}
	
	
	@PutMapping(value = "")
	public void actualizarCuenta(@RequestBody Cuentas cuenta) {
		cuentaService.actualizarCuenta(cuenta);
	}
	
	
    @PatchMapping(value = "/{numero}")
	public void actualizaNombre(@PathVariable("numero") long numero){
		cuentaService.actualizarCuenta(numero);
	}
    
    
    @DeleteMapping(value =  "/{numero}")
	public ResponseEntity<Boolean> eliminar(@PathVariable("numero") long numero){
    	cuentaService.eliminarCuenta(numero);
    	return ResponseEntity.ok(!(cuentaService.findallbyCuenta(numero)!=null));
	}
    
    /*
    @DeleteMapping(value =  "/{numero}")
	public void eliminar(@PathVariable("numero") long numero){
    	cuentaService.eliminarCuenta(numero);
	}
    
*/
}
