package edu.udelp.poo.model;

import lombok.Data;

@Data
public class Rectangulo extends AbstractFigura{
	private Double altura;
	public Rectangulo(Double base, Double altura) {
		super(base);
		this.altura=altura;
	}

	@Override
	public Double perimetro() {
		return (lado*2)+(altura*2);
	}

	@Override
	public Double area() {
		return lado*altura;
	}

	@Override
	public Integer numLados() {
		return 4;
	}

	@Override
	public String nombreFigura() {
		return "Rectangulo";
	}

}
