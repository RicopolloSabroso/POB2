package edu.udelp.poo.model;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;
@Data
public class Estudiante extends Persona {
	private Integer semestre;
	private List<MateriaAlumno> materias=null;
	private String generacion;
	private Carrera carrera;


	public Estudiante(String nombre, String fechaNacimiento, char sexo,Integer semestre,String generacion,Carrera carrera) {
	    super(nombre, fechaNacimiento, sexo); 
		this.semestre=semestre;
		this.carrera=carrera;
		this.generacion=generacion;

	}

	public String toString() {
		return "\n"+getNombre()+" [Id="+getId()+", semestre=" + semestre + ", generacion=" + generacion
				+ ", carrera=" + carrera + "]"+"\n"+ "Materias=" + materias ;
	}
	public String getInfo() {
		return  getNombre()+" [Id="+getId()+", semestre=" + semestre + ", generacion=" + generacion
				+ ", carrera=" + carrera + "]"+"\n";
	}
    
	
	
	

}
