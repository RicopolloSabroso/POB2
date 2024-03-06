package examenes;

import edu.udelp.poo.procesos.ProcesosTienda;
import edu.udelp.poo.model.Prendas;
import java.util.LinkedList;
import java.util.Scanner;

import edu.udelp.poo.model.Blusas;
import edu.udelp.poo.model.Camisas;
import edu.udelp.poo.model.Faldas;
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
		boolean ciclo=true;
		 String nombre, opcion, opcion2,genero, tamano, cantidad, precioCompra;
	        do {
	            System.out.println("1. Dar de alta Prendas\n2.Ver inventario\n3. Vender Prendas\n4. Ver tabla Ventas\n5.Salir\nSeleccione una opción:");
	            opcion = scanner.nextLine();
	            switch (Integer.parseInt(opcion)) {
	                case 1:
	                	do {
	                		 System.out.println("1. pantalones de vestir\n2.pantalones de mezclilla\n3.camisas \n4.faldas\n5.blusas\n6.playeras  \nSeleccione una opción: ");
	                          opcion2 = scanner.nextLine();
	                          switch(Integer.parseInt(opcion2)) {
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
                                                        			proceso.precioVenta(new PantalonesVestir(genero.equalsIgnoreCase("M")?'M':'F',tamano.toUpperCase(),Double.parseDouble(precioCompra),Integer.parseInt(cantidad)));
                                                        			ciclo=false;
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
                                                        			proceso.precioVenta(new PantalonesMezclilla(genero.equalsIgnoreCase("M")?'M':'F',tamano.toUpperCase(),Double.parseDouble(precioCompra),Integer.parseInt(cantidad)));
                                                        			ciclo=false;
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
	                          	case 3:
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
                                                        			proceso.precioVenta(new Camisas(genero.equalsIgnoreCase("M")?'M':'F',tamano.toUpperCase(),Double.parseDouble(precioCompra),Integer.parseInt(cantidad)));
                                                        			ciclo=false;
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
	                          	case 4:
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
                                                			proceso.precioVenta(new Faldas(tamano.toUpperCase(),Double.parseDouble(precioCompra),Integer.parseInt(cantidad)));
                                                			ciclo=false;
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
	                          		break;
	                          	case 5:
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
                                                			proceso.precioVenta(new Blusas(tamano.toUpperCase(),Double.parseDouble(precioCompra),Integer.parseInt(cantidad)));
                                                			ciclo=false;
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
	                          		break;
	                          	case 6:
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
                                                        			proceso.precioVenta(new Playeras(genero.equalsIgnoreCase("M")?'M':'F',tamano.toUpperCase(),Double.parseDouble(precioCompra),Integer.parseInt(cantidad)));
                                                        			ciclo=false;
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
	                	String f="";
	                	double venta=0;
	                	do {
	                		if(!proceso.estaVacioInventario()) {
		                		do {
		                			proceso.tablaInventario();
		                			System.out.println("Ingrese el codigo del que quiere comprar");
		                			String codigo=scanner.nextLine();
		                			if(proceso.validarMayorA0(Integer.parseInt(codigo))) {
		                				if(proceso.validarCodigo(codigo)) {
		                					System.out.println("Ingrese la cantidad ");
	                                		cantidad =scanner.nextLine();
	                                		if(proceso.validarMayorA0(Double.parseDouble(cantidad))) {
	                                			if(proceso.validarPrendasExistentes(Integer.parseInt(codigo), Integer.parseInt(cantidad))) {
	                                				venta+=proceso.realizarVenta(Integer.parseInt(codigo), Integer.parseInt(cantidad));
	                                				System.out.println("Desea comprar otra cosa?\n presione(s)si quiere comprar otra cosa si no quiere comprar otra cosa presione cualquier cosa");
	                                				f=scanner.nextLine();
	                                				if(f.equalsIgnoreCase("S")) {
	                                					ciclo=false;
	                                				}else {
	                                					System.out.println("El costo total de las prendas es: "+venta);
	                                					ciclo=false;
	                                				}
	                                			
	                                			}else {
	                                				System.out.println("No alcanza el numero de prendas que hay en el inventario");
	                                    			ciclo=true;
	                                			}
	                                		}else {
	                                			System.out.println("El dato no puede ser negativo/0");
	                                			ciclo=true;
	                                		}
		                				}else {
		                						System.out.println("El costo total de las prendas es: "+venta+"\nNo hay prendas en almacen con ese codigo ");				
                        					ciclo=false;
                        					f="n";
		                				}
	                        		}else {
	                        			System.out.println("El dato no puede ser negativo/0");
	                        			ciclo=true;
	                        		}
		                		}while(ciclo);
		                	}else {
		                		System.out.println("Debe haber prendas existentes");	
		                		ciclo=false;
		                	}
	                	}while(f.equalsIgnoreCase("s"));
	                	
	                	break;
	                case 4:
	                    proceso.tablaVentas();
	                    break;
	                case 5:
	                    System.out.println("Adios");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (Integer.parseInt(opcion)!=6);
	    }

	}