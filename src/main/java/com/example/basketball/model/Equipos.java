package com.example.basketball.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Equipos {

@Id
private String id;
private String nombre;
private String categoria;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}



}
