package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DireccionService {

	private DireccionRepository direccionRepo;

	
	public DireccionService(DireccionRepository direccionRepo) {
		super();
		this.direccionRepo = direccionRepo;
	}
	
	/**
	 * Agrega una dirección 
	 * @param direccion a ser agregada
	 * @return Retorna la dirección persistida
	 */
	public Direccion addDireccion(Direccion direccion) {
		Direccion aux = direccionRepo.save(direccion);
		return aux;
	}
	
	
}
