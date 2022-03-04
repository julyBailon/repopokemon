package com.spring.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.entity.Cuentas;
import com.spring.demo.entity.Paises;
import com.spring.demo.repository.CuentaRepoitory;
import com.spring.demo.repository.PaisRepository;

@Service
public class PaisService {
	private PaisRepository paisRepository;
	
	@Autowired
	public PaisService( PaisRepository paisRepository) {
		this.paisRepository = paisRepository;
	}
	
	public List<Paises> findPaisesById(String nombre){
		List<Paises> PaisesRespuesta=new ArrayList();
		List<Paises> pais=paisRepository.findAll();
		for(int i=0;i<pais.size();i++) {
			if(pais.get(i).getNombre_pais()==nombre) {
				PaisesRespuesta.add(pais.get(i));
			}
			
		}
		
		return PaisesRespuesta;
	}
	
	
	

}
