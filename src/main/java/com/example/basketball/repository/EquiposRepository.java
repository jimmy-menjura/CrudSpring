package com.example.basketball.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.basketball.CrudRepository.EquiposCrudRepository;
import com.example.basketball.model.Equipos;

@Repository
public class EquiposRepository {
	@Autowired
	private EquiposCrudRepository equiposCrudRepository;
	
	public Iterable<Equipos>  obtenerEquipos() {
		return equiposCrudRepository.findAll();
	}
}
