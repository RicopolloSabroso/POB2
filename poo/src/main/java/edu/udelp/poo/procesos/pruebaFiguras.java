package edu.udelp.poo.procesos;

import edu.udelp.poo.model.AbstractFigura;
import edu.udelp.poo.model.AbstractTriangulo;
import edu.udelp.poo.model.Cuadrado;
import edu.udelp.poo.model.Figura;
import edu.udelp.poo.model.TrianguloEquilatero;

public class pruebaFiguras {
	public static void main(String[] args) {
	AbstractTriangulo fl= new TrianguloEquilatero(3D, 4D);
	fl.getResultados();
	Figura f= new TrianguloEquilatero(3D, 3D);
	Double res= f.perimetro();
	System.out.println(res);
//	Figura f2=new Figura() {
//		@Override
//		public Double perimetro() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public Double area() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//	}
	}
}
