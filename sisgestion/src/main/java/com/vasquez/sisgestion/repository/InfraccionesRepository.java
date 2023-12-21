package com.vasquez.sisgestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vasquez.sisgestion.entity.Infracciones;

@Repository
public interface InfraccionesRepository extends JpaRepository<Infracciones, Integer>{
	List<Infracciones> findByNombreContaining(String texto);
	Infracciones findByNombre(String texto);
	Infracciones create(Infracciones obj);
	Infracciones update(Infracciones obj);
	int delete(int id);
}
