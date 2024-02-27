package edu.udelp.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrianguloIsoseles extends TrianguloEquilatero {
	private Double lado;
	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return (lado*2)+getBase();
	}
}
