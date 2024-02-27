package edu.udelp.poo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import lombok.Data;
@Data
public class Persona {
	private String nombre;
	private LocalDate nacimiento;
	private Integer id;
	public char sexo;
	private double peso;
	private double altura;

	public Persona() {

	}
	public Persona(String nombre, String nacimiento, char sexo) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.nombre = nombre;
		this.nacimiento=LocalDate.parse(nacimiento, formato);
		this.sexo = sexo;
		this.id=generarId();
	}

	public Persona(String nombre, String nacimiento, char sexo, Double peso, Double altura) { 
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.nombre = nombre;
		this.nacimiento = LocalDate.parse(nacimiento, formato);
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.id=generarId();
		
	}
	private int generarId() {
		Random random = new Random();
		return random.nextInt(99999999)+10000000;
	}
	
	public String toString() {
		return "Persona ["+ "nombre=" + nombre + ", nacimiento=" + nacimiento+", ID=" + id
				+ ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
