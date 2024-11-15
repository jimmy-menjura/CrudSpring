package com.example.basketball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.basketball.model.Equipos;
import com.example.basketball.repository.EquiposRepository;

@RestController
@RequestMapping("/api")
public class EquiposController {

	@Autowired
	private EquiposRepository equiposRepository;
	
	@GetMapping("/obtenerEquipos")
	public ResponseEntity<Iterable<Equipos>> obtenerEquipos(){
		Iterable<Equipos> allEquips = equiposRepository.obtenerEquipos();
		return ResponseEntity.ok().body(allEquips);
	}
}
