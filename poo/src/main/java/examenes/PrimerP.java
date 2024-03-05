package examenes;

import edu.udelp.poo.procesos.ProcesosTienda;
import edu.udelp.poo.model.Prendas;
import edu.udelp.poo.model.PantalonesMezclilla;
import edu.udelp.poo.model.PantalonesVestir;
public class PrimerP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesosTienda procesos=new ProcesosTienda();
		PantalonesVestir p=new PantalonesVestir('M',"G",10.0,15);
		procesos.precioVenta(p);
		procesos.precioVenta(new PantalonesVestir('F',"CH",15.0,12));
		procesos.tablaInventario();
		System.out.println(procesos.realizarVenta(p.getCodigo(), 5));
		procesos.tablaInventario();
		procesos.tablaVentas();
	}

}
