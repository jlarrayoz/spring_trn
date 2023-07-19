package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
	/**
	 * Devuelve una persona por el nombre completo
	 * @param nombreCompleto
	 * @return Optional<Persona>
	 */
	Optional<Persona> findPersonaByNombreCompleto(String nombreCompleto);

}
