package examenes;

import edu.udelp.poo.procesos.ProcesosTienda;
import edu.udelp.poo.model.Prendas;
import java.util.LinkedList;
import java.util.Scanner;
import edu.udelp.poo.model.PantalonesMezclilla;
import edu.udelp.poo.model.PantalonesVestir;
import edu.udelp.poo.model.Playeras;
public class PrimerP {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ProcesosTienda proceso=new ProcesosTienda();
//		PantalonesVestir p=new PantalonesVestir('M',"G",10.0,15);
//		proceso.precioVenta(p);
//		proceso.precioVenta(new Playeras('F',"CH",15.0,12));
//		proceso.tablaInventario();
//		System.out.println(proceso.realizarVenta(p.getCodigo(), 5));
//		proceso.tablaInventario();
//		proceso.tablaVentas();
		boolean ciclo=false;
		 String nombre, opcion,genero, tamano, cantidad, precioCompra;
	        do {
	            System.out.println("1. Dar de alta Prendas\n2.Ver inventario\n3. Vender Prendas\n4. Ver tabla Ventas\n5.Salir\nSeleccione una opción:");
	            opcion = scanner.nextLine();
	            switch (Integer.parseInt(opcion)) {
	                case 1:
	                	do {
	                		 System.out.println("1. pantalones de vestir\n2.pantalones de mezclilla\n3.camisas \n4.faldas\n5.blusas\n6.playeras  \nSeleccione una opción: ");
	                          opcion = scanner.nextLine();
	                          switch(Integer.parseInt(opcion)) {
	                          	case 1:
	                          		do {
                                		System.out.println("Ingrese el genero(M/F) ");
                                		genero =scanner.nextLine();
                                		if(genero.equalsIgnoreCase("M")||genero.equalsIgnoreCase("F")) {
                                			
                                			do {
                                        		System.out.println("Ingrese la Talla(CH/M/G/EX) ");
                                        		tamano =scanner.nextLine();
                                        		if(proceso.validarTalla(tamano)) {
                                        			do {
                                                		System.out.println("Ingrese el precio de compra ");
                                                		precioCompra =scanner.nextLine();
                                                		if(proceso.validarMayorA0(Double.parseDouble(precioCompra))) {
                                                			do {
                                                        		System.out.println("Ingrese la cantidad ");
                                                        		cantidad =scanner.nextLine();
                                                        		if(proceso.validarMayorA0(Double.parseDouble(cantidad))) {
                                                        			proceso.precioVenta(new PantalonesVestir(genero=="M"?'M':'F',tamano,Double.parseDouble(precioCompra),Integer.parseInt(cantidad)));
                                                        		}else {
                                                        			System.out.println("El dato no puede ser negativo/0");
                                                        			ciclo=true;
                                                        		}
                                                        	}while(ciclo);
                                                		}else {
                                                			System.out.println("El dato no puede ser negativo/0");
                                                			ciclo=true;
                                                		}
                                                	}while(ciclo);
                                        		}else {
                                        			System.out.println("dato no valido");
                                        			ciclo=true;
                                        		}
                                        	}while(ciclo);
                                		}else {
                                			System.out.println("dato no valido");
                                			ciclo=true;
                                		}
                                	}while(ciclo);
	                          		break;
	                          	case 2:
	                          		break;
	                          	case 3:
	                          		break;
	                          	case 4:
	                          		break;
	                          	case 5:
	                          		break;
	                          	case 6:
	                          		break;
	                        	  default:
	                        		  System.out.println("escoja la opcion correcta");
			                          ciclo=true;
	                        		  
	                          }
	                      }while(ciclo);
	                    break;
	                case 2:
	                  proceso.tablaInventario();
	                    break;
	                case 3:
	                	if(proceso.estaVacioInventario()) {
	                		
	                	}else {
	                		System.out.println("Debe haber prendas existentes");	
	                		ciclo=false;
	                	}
	                	break;
	                case 4:
	                    
	                    break;
	                case 5:
	                    System.out.println("Adios");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (Integer.parseInt(opcion)!=5);
	    }

	}