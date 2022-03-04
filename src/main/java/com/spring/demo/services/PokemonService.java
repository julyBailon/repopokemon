package com.spring.demo.services;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class PokemonService {
	private String urlPokemon= "https://pokeapi.co/api/v2/pokemon";
	
    public PokemonService() {
		
	}
/*	private PokemonRepository pokemonRepository;
	

	@Autowired
	public PokemonService(PokemonRepository pokemonRepository) {
		this. pokemonRepository =  pokemonRepository;
	}
	
	*/
    
   
	public String imprimirPokemon(String nombrePok) {
		System.out.println(urlPokemon+"/"+nombrePok);
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(urlPokemon+"/"+nombrePok);
		return restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
		
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
	
	public String obtenerBaseExperience(String nombrePok) {
		String obtenerAbili="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAbili =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAbili);
			obtenerAbili =  obtenerObj.optString("base_experience");
		}catch(JSONException e) {
			System.out.println("Error a convertir la cadena en JSON "+e.toString());

		}
		return obtenerAbili;
	}


	public String obtenerHeld_items(String nombrePok) {
		String obtenerAbili="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAbili =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAbili);
			obtenerAbili = obtenerObj.optString("held_items");
		}catch(JSONException e) {
			System.out.println("Error a convertir la cadena en JSON "+e.toString());

		}
		return obtenerAbili;
	}


	public String obtenerID(String nombrePok) {
		String obtenerAbili="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAbili =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAbili);
			obtenerAbili = obtenerObj.optString("id");
		}catch(JSONException e) {
			System.out.println("Error a convertir la cadena en JSON "+e.toString());

		}
		return obtenerAbili;
	}
	

	public String obtenerName(String nombrePok) {
		String obtenerAbili="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAbili =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAbili);
			obtenerAbili = obtenerObj.getJSONObject("name").toString();
		}catch(JSONException e) {
			System.out.println("Error a convertir la cadena en JSON "+e.toString());

		}
		return obtenerAbili;
	}
	
	public String obtenerLocationAreaeEncounters(String nombrePok) {
		String obtenerAbili="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			obtenerAbili =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject obtenerObj = new JSONObject(obtenerAbili);
			obtenerAbili = obtenerObj.optString("location_area_encounters");
		}catch(JSONException e) {
			System.out.println("Error a convertir la cadena en JSON "+e.toString());

		}
		return obtenerAbili;
	}


	

}
