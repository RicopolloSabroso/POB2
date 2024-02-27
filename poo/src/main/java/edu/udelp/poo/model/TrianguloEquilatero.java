package edu.udelp.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrianguloEquilatero implements Figura{
	private Double base;
	private Double altura;
	
	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return base*3;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

}
