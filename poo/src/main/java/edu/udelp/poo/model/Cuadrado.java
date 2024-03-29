package edu.udelp.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Cuadrado extends AbstractFigura{
	public Cuadrado(Double lado) {
		super(lado);
	}
	@Override
	public Double perimetro() {
		return lado*numLados();
	}

	@Override
	public Double area() {
		return lado*lado;
	}

	@Override
	public Integer numLados() {
		return 4;
	}

	@Override
	public String nombreFigura() {
		return "Cuadrado";
	}
}
