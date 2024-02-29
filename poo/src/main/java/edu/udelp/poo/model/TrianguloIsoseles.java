package edu.udelp.poo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TrianguloIsoseles extends AbstractTriangulo {
	private Double ladoDiferente;
	public TrianguloIsoseles(Double lado,Double ladoDiferente, Double altura) {
		super(lado, altura);
		this.ladoDiferente=ladoDiferente;
	}
	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return ladoDiferente+(lado*2);
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return (ladoDiferente*altura)/2;
	}

	@Override
	public Integer numLados() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String nombreFigura() {
		// TODO Auto-generated method stub
		return "Triangulo Isosceles";
	}
	
}
