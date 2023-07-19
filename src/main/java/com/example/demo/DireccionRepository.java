package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository<Direccion, Long>{
	
	/**
	 * Devuelve una dirección por el id de la persona
	 * @param id Id de la persona
	 * @return Optional<Direccion>
	 */
	Optional<Direccion> findDireccionByPersonaId(Long id);

}
