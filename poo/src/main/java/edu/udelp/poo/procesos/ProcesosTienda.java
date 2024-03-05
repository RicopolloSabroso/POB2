package edu.udelp.poo.procesos;

import java.util.LinkedList;
import java.util.List;

import edu.udelp.poo.model.Camisas;
import edu.udelp.poo.model.Faldas;
import edu.udelp.poo.model.PantalonesMezclilla;
import edu.udelp.poo.model.PantalonesVestir;
import edu.udelp.poo.model.Prendas;
import edu.udelp.poo.model.Blusas;

public class ProcesosTienda {
	private List<Prendas> inventario=new LinkedList<Prendas>();
	private List<Prendas> ventas=new LinkedList<Prendas>();
	
	public void precioVenta(Prendas prenda) {
        double precioVenta;
        if (prenda.getTalla().equals("CH") || prenda.getTalla().equals("M")) {
            precioVenta = prenda.getPrecioCompra() * 1.1;
        } else {
            precioVenta = prenda.getPrecioCompra() * 1.2;
        }
        prenda.setPrecioVenta(precioVenta);      
        alta(prenda);
	}
	public boolean validarMayorA0(double c) {
		if( c > 0) {
    		return true;
    	}
        return false;
    }
	public boolean estaVacioInventario() {
		return inventario.isEmpty();
	}
	public boolean estaVacioVentas() {
		return ventas.isEmpty();
	}
	public boolean validarPrendasExistentes(int codigo, int cantidad)throws Exception{
		if(null==inventario ) {
			throw new Exception("No alcanza el numero de prendas");
		}
		for (Prendas x : inventario) {
			if(x.getCodigo()==codigo&& x.getCantidad()-cantidad>0) {
				return true;
			}
		}
		return false;
	}
	private void alta(Prendas prenda) {
		inventario.add(prenda);
	}
	public boolean validarTalla(String talla) {
        return talla == "CH" || talla == "M"|| talla == "G" || talla == "EX";
    }
	public void tablaInventario() {
		System.out.println("Tabla Inventario\nCodigo\t| Prenda\t| Tamaño\t| Genero\t| Cantidad\t| Precio Compra\t| Precio venta");
		System.out.println(inventario);
		
	}
	public void tablaVentas() {
		System.out.println("Tabla Ventas\nCodigo\t| Prenda\t| Tamaño\t| Genero\t| Cantidad\t| Precio Compra\t| Precio venta");
		System.out.println(ventas);
		
	}
	public double realizarVenta(int codigo, int cantidad) throws Exception{
		double venta=0;
		int c;
		if(validarPrendasExistentes(codigo, cantidad)) {
			for(Prendas p:inventario) {
				if(p.getCodigo()==codigo) {
					c=p.getCantidad();
					venta=p.getPrecioVenta()*cantidad;
					p.setCantidad(c-cantidad);
					if(p.getDescripcion().equalsIgnoreCase("PantalonesVestir")) {
						PantalonesVestir value=new PantalonesVestir(p.getGenero(),p.getTalla(),p.getPrecioCompra(), cantidad);
						value.setCodigo(p.getCodigo());
						value.setPrecioVenta(p.getPrecioVenta());
						ventas.add(value);
					}
					if(p.getDescripcion().equalsIgnoreCase("PantalonesMezclilla")) {
						PantalonesMezclilla value=new PantalonesMezclilla(p.getGenero(),p.getTalla(),p.getPrecioCompra(), cantidad);
						value.setCodigo(p.getCodigo());
						value.setPrecioVenta(p.getPrecioVenta());
						ventas.add(value);
					}
					if(p.getDescripcion().equalsIgnoreCase("Camisas")) {
						Camisas value=new Camisas(p.getGenero(),p.getTalla(),p.getPrecioCompra(), cantidad);
						value.setCodigo(p.getCodigo());
						value.setPrecioVenta(p.getPrecioVenta());
						ventas.add(value);
					}
					if(p.getDescripcion().equalsIgnoreCase("Faldas")) {
						Faldas value=new Faldas(p.getTalla(),p.getPrecioCompra(),cantidad);
						value.setCodigo(p.getCodigo());
						value.setPrecioVenta(p.getPrecioVenta());
						ventas.add(value);
					}
					if(p.getDescripcion().equalsIgnoreCase("Blusas")) {
						Blusas value=new Blusas(p.getTalla(),p.getPrecioCompra(), cantidad);
						value.setCodigo(p.getCodigo()); 
						value.setPrecioVenta(p.getPrecioVenta());
						ventas.add(value);
					}
					if(p.getDescripcion().equalsIgnoreCase("Playeras")) {
						Camisas value=new Camisas(p.getGenero(),p.getTalla(),p.getPrecioCompra(), cantidad);
						value.setCodigo(p.getCodigo());
						value.setPrecioVenta(p.getPrecioVenta());
						ventas.add(value);
					}
				}
			}
		}
		return venta;
	}

}
