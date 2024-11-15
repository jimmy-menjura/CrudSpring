package com.example.basketball.CrudRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.basketball.model.Equipos;

public interface EquiposCrudRepository extends MongoRepository<Equipos, Integer> {

}
