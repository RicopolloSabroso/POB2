package edu.udelp.poo.procesos;

import edu.udelp.poo.model.Cuadrado;
import edu.udelp.poo.model.Figura;
import edu.udelp.poo.model.TrianguloEquilatero;

public class pruebaFiguras {
	public static void main(String[] args) {
	Figura f= new Cuadrado(3D);
	Double res= f.perimetro();
	System.out.println(res);
	f= new TrianguloEquilatero(3D, 3D);
	Double res= f.perimetro();
	System.out.println(res);
	}
}
