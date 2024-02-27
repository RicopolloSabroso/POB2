package edu.udelp.poo.model;


import java.util.LinkedList;
import java.util.List;

import lombok.Data;

@Data
public class Profesor extends Persona {
	private List<Materia> materias;
	
    public Profesor(String nombre, String fechaNacimiento, char sexo) {
        super(nombre, fechaNacimiento, sexo);
        this.materias = new LinkedList<Materia>(); 
    }
	public List<Materia> getMaterias(){
		return materias;
	}

	public void setMaterias(LinkedList<Materia> materias) {
		this.materias = materias;
		
	}
	public void addMateria(Materia materia) {
		this.materias.add(materia);
	}
	public String toString() {
		return "Profesor "+ getNombre()+", ID: "+getId()+" [, materias=" + materias + "]\n";
	}
	
    public void imprimirMateriasAsignadas() {
        System.out.println("Materias encargadas del profesor:");
        for (Materia materia : materias) {
            System.out.println("Materia: "+ materia.getNombre());
        }
    }
	
	
	

}