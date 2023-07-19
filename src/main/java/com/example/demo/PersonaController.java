package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@PostMapping("/add")
	public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) throws Exception {
		Persona aux = personaService.addPersona(persona);
		return new ResponseEntity<Persona>(aux, HttpStatus.CREATED);
	}
}
