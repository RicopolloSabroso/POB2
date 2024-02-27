package edu.udelp.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuadrado implements Figura{
	private Double lado;

	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
}
