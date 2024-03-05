package edu.udelp.poo.model;

import java.util.Random;

import lombok.Data;
@Data
public abstract class  Prendas {
	protected int codigo;
    protected String descripcion;
    protected String talla;
    protected double precioCompra;
    protected double precioVenta;
    protected int cantidad;
	protected char genero;
    
    public Prendas( String descripcion, char genero, String talla, double precioCompra, int cantidad) {
        this.codigo = generarId();
        this.descripcion = descripcion;
        this.genero = genero;
        this.talla = talla;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
    }
    private int generarId() {
		Random random = new Random();
		return random.nextInt(99999999)+10000000;
	}
	@Override
	public String toString() {
		return  codigo + " |"+ descripcion + "\t\t|" + talla + "\t\t|"+genero+"\t\t|" + cantidad
				+ "\t\t|" + precioCompra + "\t\t|" + precioVenta+"\n";
	}

}
