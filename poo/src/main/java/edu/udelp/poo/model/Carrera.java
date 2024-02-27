package edu.udelp.poo.model;

import java.util.Objects;

import lombok.Data;


@Data
public class Carrera {
	
	private String nombre;
	public Carrera(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		return Objects.equals(nombre, other.nombre);
	}
}
