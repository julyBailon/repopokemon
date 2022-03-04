package com.spring.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.demo.entity.Cuentas;
import com.spring.demo.repository.CuentaRepoitory;


@Service
public class CuentaService {
	private CuentaRepoitory cuentaRepository;
	
	private String urlPokemon= "https://pokeapi.co/api/v2/pokemon";
	@Autowired
	public CuentaService(CuentaRepoitory cuentaRepoitory) {
		this.cuentaRepository = cuentaRepoitory;
	}
	
	public String obtenerAbilities(String nombrePok) {
		String obtenerAbili="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAbili =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAbili);
			obtenerAbili = obtenerObj.optString("abilities");
		}catch(JSONException e) {
			System.out.println("Error a convertir la cadena en JSON "+e.toString());

		}
		return obtenerAbili;
	}
	

	public List<Cuentas> consultarCuentas() {
		return cuentaRepository.findAll();
	}
	
	public List<Cuentas> findallbyCuenta(long id){
		List<Cuentas> cuentaRespuesta=new ArrayList();
		List<Cuentas> cuenta=cuentaRepository.findAll();
		for(int i=0;i<cuenta.size();i++) {
			if(cuenta.get(i).getNumcuenta()==id) {
				cuentaRespuesta.add(cuenta.get(i));
			}
			
		}
		
		return cuentaRespuesta;
	}
	
	
	
	public void guardar(Cuentas cuenta) {
		cuentaRepository.save(cuenta);
	}
	
	
	public void actualizarCuenta(Cuentas cuentas) {
		Cuentas cuent =new Cuentas();
		cuent.setNumcuenta(cuentas.getNumcuenta());
		cuent.setNombre_cuenta(cuentas.getNombre_cuenta());
		cuentaRepository.save(cuentas);
	}
	
	public void actualizarCuenta(Long numero) {
		String nombre ="nuevacuenta";
		Cuentas cuent =new Cuentas();
		cuent.setNumcuenta(numero);
		cuent.setNombre_cuenta(nombre);
		cuentaRepository.save(cuent);
	}
	
	
	public void eliminarCuenta(Long numCuenta) {
		Cuentas cat = new Cuentas();
		cat=cuentaRepository.findByNumcuenta(numCuenta);
		if(cat != null){
			cuentaRepository.delete(cat);
		}
		
	}
	
	

}
