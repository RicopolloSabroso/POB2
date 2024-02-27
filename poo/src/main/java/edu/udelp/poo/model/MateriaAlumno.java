package edu.udelp.poo.model;

import lombok.Data;

@Data
public class MateriaAlumno extends Materia {

	private Double primerParcial;
	private Double segundoParcial;
	private Double proyecto;
	private Double examenFinal;
	public MateriaAlumno(String semestre, String horario, String nombre, Carrera carrera) {
		super(semestre,horario,nombre,carrera);
		this.primerParcial=0.0;
		this.segundoParcial=0.0;
		this.examenFinal=0.0;
		this.proyecto=0.0;
	}
	@Override
	public String toString() {
		return  "\n["+getNombre()+", primerParcial=" + primerParcial + ", segundoParcial="
				+ segundoParcial + ", proyecto=" + proyecto + ", examenFinal=" + examenFinal +"]";
	}
	
	
	
	

}