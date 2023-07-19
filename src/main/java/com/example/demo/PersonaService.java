package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PersonaService {

	private PersonaRepository personaRepo;
	
	private DireccionService direccionService;

	
	public PersonaService(PersonaRepository personaRepo, DireccionService direccionService) {
		super();
		this.personaRepo = personaRepo;
		this.direccionService = direccionService;
	}
	
	public Persona addPersona(Persona persona) throws Exception {
		Persona aux = personaRepo.save(persona);
		
		Direccion direccion = new Direccion();
		
		direccion.setDireccion("18 de Julio 1234");
		
		direccion.setPersona(persona);
		
		direccionService.addDireccion(direccion);
		
		return aux;
	}
	
}
