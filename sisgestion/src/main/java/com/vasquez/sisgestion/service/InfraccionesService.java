package com.vasquez.sisgestion.service;

import java.util.List;

import com.vasquez.sisgestion.entity.Infracciones;

public interface InfraccionesService {
	public List<Infracciones> findAll();
	public Infracciones findById(int id);
	public Infracciones findByNombre(String nombre);
	public List<Infracciones> findByNombreContaining(String nombre);
	public Infracciones create(Infracciones obj);
	public Infracciones update(Infracciones obj);
	public int delete(int id);
}
