package main.ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

import edu.udelp.poo.model.Carrera;
import edu.udelp.poo.model.Estudiante;
import edu.udelp.poo.model.Materia;
import edu.udelp.poo.model.Profesor;
import edu.udelp.poo.procesos.ProcesoPersona;
import edu.udelp.poo.procesos.ProcesosEscuela;


public class PrincipalEscuela {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ProcesosEscuela procesos=new ProcesosEscuela(); 
		procesos.init();
		//System.out.println(procesos.alumnos.size());
		ProcesoPersona proceso=new ProcesoPersona();
	     String opcion, dato,horario,semestre,fecha,carrera, generacion,id,nombre,primerParcial,segundoParcial,proyecto,examenFinal;
	     char sexo;
	     boolean ciclo=false;
	     
	     do {
	         System.out.println("Menú:\n1. Dar de alta carreras\n2. Dar de alta materias\n"
	         		+ "3. Dar de alta profesores\n4. Dar de alta alumnos\n5. Asignar materias a los profesores\n6. Asignar carrera a los alumnos"
	         		+ "\n7. Agregar calificaciones a los alumnos por materia\n8. Obtener datos del alumno\n9. Obtener el promedio por materia\n10. Obtener el promedio por alumno\n11. Obtener el promedio del semestre del alumno"
	         		+ "\n12. Obtener el promedio por materia\n13. Obtener el promedio por carrera\n14. Salir\nIngrese la opción deseada: ");
	         opcion = scanner.nextLine();
	         switch (Integer.parseInt(opcion)) {
	             case 1:
	            	 do {
	            		 System.out.println("Escriba el nombre de la carrera: ");
		            	 dato=scanner.nextLine();
		            	 if(procesos.devolverCarrera(dato)==null ) {
		            		 procesos.darDeAltaCarreras(new Carrera(dato));
			            	 System.out.println("Desea dar de alta otra carrera? \npresione 0 para Si y 1 para No ");
			            	 dato=scanner.nextLine();
			            	 if(Integer.parseInt(dato)==0) {
			            		 ciclo=true;
			            	 }else {
			            		 ciclo=false;
			            	 }
		            	 }else {
		            		 System.out.println("La carrera ya existe");
		            		 ciclo=true;
		            	 }
		            	 
	            	 }while(ciclo);
	                 break;
	             case 2:
	            	 if(!procesos.estaVacioCarreras()) {
	            		 do {
		            		 System.out.println("Escriba el nombre de la materia: ");
			            	 dato=scanner.nextLine();
			            	 if(procesos.validarMaterias(dato)==null ) {
			            		 System.out.println("Escriba el horario: ");
				            	 horario=scanner.nextLine();
				            	 do {
				            		 System.out.println(procesos.getCarreras());
				            		 System.out.println("Escriba el nombre de la carrera: ");
					            	 carrera=scanner.nextLine();
					            	 if(procesos.devolverCarrera(carrera)!=null ) {
					            		 System.out.println("Escriba el numero del semestre: ");
						            	 semestre=scanner.nextLine();
						            	 procesos.darDeAltaMaterias(new Materia(semestre,horario,dato,procesos.devolverCarrera(carrera)));
						            	 ciclo=false;
					            	 }else {
					            		 System.out.println("La carrera no existe");
					            		 ciclo=true;
					            	 }
					            	 
				            	 }while(ciclo);
			            	 }else {
			            		 System.out.println("La materia ya existe");
			            		 ciclo=true;
			            	 }
			            	 
		            	 }while(ciclo); 
	            	 }else {
	            		 System.out.println("No hay carrera existente para dar de alta una materia");
	            	 }
	                 break;
	             case 3:
	            	 System.out.println("Ingrese el nombre: ");
	            	 dato = scanner.nextLine();
	            	 do {
	            		 System.out.println("Ingrese la fecha de nacimiento:\n Con formato dd/MM/yyyy ");
	            		 fecha = scanner.nextLine();
	            		 if(proceso.validarFechaNacimiento(fecha)) {
	            			 do {
	            				 System.out.println("Ingrese el sexo (H/M): ");
	            				 sexo = scanner.nextLine().charAt(0);
	            				 if(proceso.validarGenero(sexo)) {
	            					procesos.darDeAltaProfesores(new Profesor( dato,  fecha,  sexo));
	            					ciclo=false;
	            				 }else {
	            					 System.out.println("No es valido");
	            					 ciclo=true;
	            				 }
	            			 }while(ciclo);

	            		 }else {
	            			 ciclo=true;
	            		 }
	            	 }while(ciclo);
	            	 break;
	             case 4:
	            	 if(!procesos.estaVacioCarreras()) {
	            		 System.out.println("Ingrese el nombre: ");
		            	 dato = scanner.nextLine();
		            	 do {
		            		 System.out.println("Ingrese la fecha de nacimiento:\n Con formato dd/MM/yyyy ");
		            		 fecha = scanner.nextLine();
		            		 if(proceso.validarFechaNacimiento(fecha)) {
		            			 do {
		            				 System.out.println("Ingrese el sexo (H/M): ");
		            				 sexo = scanner.nextLine().charAt(0);
		            				 if(proceso.validarGenero(sexo)) {
		            					 do {
		            						 System.out.println(procesos.getCarreras());
						            		 System.out.println("Escriba el nombre de la carrera: ");
							            	 carrera=scanner.nextLine();
							            	 if(procesos.devolverCarrera(carrera)!=null ) {
							            		 System.out.println("Escriba el numero del semestre(1,2,3...): ");
								            	 semestre=scanner.nextLine();
								            	 System.out.println("Escriba La generacion del alumno: ");
								            	 generacion=scanner.nextLine();
								            	 procesos.darDeAltaAlumnos(new Estudiante(dato,fecha,sexo,Integer.parseInt(semestre), generacion,procesos.devolverCarrera(carrera)));
								            	 ciclo=false;
							            	 }else {
							            		 System.out.println("La carrera no existe");
							            		 ciclo=true;
							            	 }
							            	 
						            	 }while(ciclo);
		            				 }else {
		            					 System.out.println("No es valido");
		            					 ciclo=true;
		            				 }
		            			 }while(ciclo);

		            		 }else {
		            			 ciclo=true;
		            		 }
		            	 }while(ciclo);
	            	 }else {
	            		 System.out.println("No hay carrera existente para dar de alta un alumno");
	            	 }
	            	 break;
	             case 5:
	            	 if(!procesos.estaVacioProfesores()&& !procesos.estaVacioMaterias()) {
	            		 do {
	            			 System.out.println(procesos.getProfesores());
		            		 System.out.println("Ingrese el Id del profesor: ");
			            	 dato = scanner.nextLine();
			            	 if(procesos.buscarProfesorPorID(Integer.parseInt(dato))!=null) {
			            		 do {
			            			 System.out.println("Ingrese el nombre de la materia que quiere asignar: ");
			            			 nombre = scanner.nextLine();
					            	 if(procesos.buscarMateria(nombre)!=null) {
					            		 procesos.asignarMateriasProfesor(Integer.parseInt(dato), procesos.buscarMateria(nombre));
					            	 }else {
					            		 System.out.println("la materia no existe");
					            		 ciclo=true;
					            	 }
				            	 }while(ciclo);
			            	 }else {
			            		 System.out.println("El profe no existe");
			            		 ciclo=true;
			            	 }
			            	 
		           
		            	 }while(ciclo);
	              	 }else {
	            		 System.out.println("No hay profesores/materias existentes para dar de alta una materia");
	            	 }	
	            	 break;
	             case 6:
	            	 if(!procesos.estaVacioAlumnos()&& !procesos.estaVacioCarreras()) {
	            		 do {
	            			 System.out.println(procesos.getCarreras());
	            			 System.out.println("Escriba el nombre de la carrera: ");
			            	 dato=scanner.nextLine();
			            	 if(procesos.devolverCarrera(dato)!=null ) {
			            		do {
			            			System.out.println(procesos.getAlumnos());
			            			 System.out.println("Ingrese el Id del Alumno a asignar la carrera: ");
					            	 id = scanner.nextLine();
					            	 if(procesos.buscarAlumnoPorID(Integer.parseInt(id))!=null) {
					            		procesos.asignarCarreras(Integer.parseInt(id), procesos.devolverCarrera(dato));
					            		 ciclo=false;
					            	 }else {
					            		 System.out.println("El alumno no existe");
					            		 ciclo=true;
					            	 }
					            	 
			            		}while(ciclo);
			            	 }else {
			            		 System.out.println("La carrera no existe");
			            		 ciclo=true;
			            	 }
			            	 
		            	 }while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos/carreras existentes para dar de alta una materia");
	            	 }	
	            	 break;
	             case 7:
	            	 if(!procesos.estaVacioAlumnos()) {
	            		 do {
		            			System.out.println(procesos.getAlumnos());
		            			 System.out.println("Ingrese el Id del Alumno para calificar: ");
				            	 id = scanner.nextLine();
				            	 if(procesos.buscarAlumnoPorID(Integer.parseInt(id))!=null) {
				            		 if(!procesos.materiasAlumnoVacio(procesos.buscarAlumnoPorID(Integer.parseInt(id)))) {
				            			 do {
				            				 System.out.println(procesos.buscarAlumnoPorID(Integer.parseInt(id)).getMaterias());
					            			 System.out.println("Ingrese el nombre de la materia que quiere asignar la calificacion: ");
					            			 nombre = scanner.nextLine();
							            	 if(procesos.validarMateriasAlumno(procesos.buscarAlumnoPorID(Integer.parseInt(id)), nombre)!=null) {
							            		 System.out.println("Escriba la calificacion del Primer Parcial:");
							            		 primerParcial=scanner.nextLine();
							            		 System.out.println("Escriba la calificacion del Segundo Parcial:");
							            		 segundoParcial=scanner.nextLine();
							            		 System.out.println("Escriba la calificacion del proyecto :");
							            		 proyecto=scanner.nextLine();
							            		 System.out.println("Escriba la calificacion del Examen Final:");
							            		 examenFinal=scanner.nextLine();
							            		 procesos.agregarCalificacion(procesos.buscarAlumnoPorID(Integer.parseInt(id)), nombre, Double.parseDouble(primerParcial), Double.parseDouble(segundoParcial), Double.parseDouble(proyecto), Double.parseDouble(examenFinal));
							            		 ciclo=false;
							            	 }else {
							            		 System.out.println("la materia no existe");
							            		 ciclo=true;
							            	 }
						            	 }while(ciclo);
				            			 
				            		 }else {
				            			 System.out.println("el alumno no tiene materias");
					            		 ciclo=false;
				            		 }
				            	 }else {
				            		 System.out.println("El alumno no existe");
				            		 ciclo=true;
				            	 }
				            	 
		            		}while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos/carreras existentes para dar de alta una materia");
	            	 }	
	            	 
	            	 break;
	             case 8:
	            	 if(!procesos.estaVacioAlumnos()) {
	            		 do {
		            			System.out.println(procesos.getAlumnos());
		            			 System.out.println("Ingrese el Id del Alumno para su info: ");
				            	 id = scanner.nextLine();
				            	 if(procesos.buscarAlumnoPorID(Integer.parseInt(id))!=null) {
				            		System.out.println(procesos.buscarAlumnoPorID(Integer.parseInt(id)));
				            		ciclo=false;
				            	 }else {
				            		 System.out.println("El alumno no existe");
				            		 ciclo=true;
				            	 }
				            	 
		            		}while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos existentes");
	            	 }	
	            	 break;
	             case 9:
	            	 if(!procesos.estaVacioAlumnos()) {
	            		 do {
		            			System.out.println(procesos.getAlumnosConMaterias());
		            			 System.out.println("Ingrese el Id del Alumno para obtener el promedio: ");
				            	 id = scanner.nextLine();
				            	 if(procesos.buscarAlumnoPorID(Integer.parseInt(id))!=null) {
				            		 if(!procesos.materiasAlumnoVacio(procesos.buscarAlumnoPorID(Integer.parseInt(id)))) {
				            			 do {
				            				 System.out.println(procesos.buscarAlumnoPorID(Integer.parseInt(id)).getMaterias());
					            			 System.out.println("Ingrese el nombre de la materia que quiere obtener el promedio: ");
					            			 nombre = scanner.nextLine();
							            	 if(procesos.validarMateriasAlumno(procesos.buscarAlumnoPorID(Integer.parseInt(id)), nombre)!=null) {
							            		 System.out.println(procesos.promedioPorMateriaAlumno(procesos.buscarAlumnoPorID(Integer.parseInt(id)), nombre));
							            		 ciclo=false;
							            	 }else {
							            		 System.out.println("la materia no existe en el alumno");
							            		 ciclo=true;
							            	 }
						            	 }while(ciclo);
				            			 
				            		 }else {
				            			 System.out.println("el alumno no tiene materias");
					            		 ciclo=false;
				            		 }
				            	 }else {
				            		 System.out.println("El alumno no existe");
				            		 ciclo=true;
				            	 }
				            	 
		            		}while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos existentes");
	            	 }
	            	 //	                 obtenerPromedioPorMateria();
	            	 break;
	             case 10:
	            	 if(!procesos.estaVacioAlumnos()) {
	            		 do {
		            			System.out.println(procesos.getAlumnosConMaterias());
		            			 System.out.println("Ingrese el Id del Alumno para obtener el promedio del semestre: ");
				            	 id = scanner.nextLine();
				            	 if(procesos.buscarAlumnoPorID(Integer.parseInt(id))!=null) {
				            		 if(!procesos.materiasAlumnoVacio(procesos.buscarAlumnoPorID(Integer.parseInt(id)))) {
				            			 do {
					            			 System.out.println("Ingrese el numero del semestre que quiere obtener el promedio(1, 2, 3...): ");
					            			 semestre = scanner.nextLine();
							            	 procesos.promedioPorSemestreDelAlumno(procesos.buscarAlumnoPorID(Integer.parseInt(id)), Integer.parseInt(semestre));
							            	 ciclo=false;
				            			 }while(ciclo);
				            			 
				            		 }else {
				            			 System.out.println("el alumno no tiene materias");
					            		 ciclo=false;
				            		 }
				            	 }else {
				            		 System.out.println("El alumno no existe");
				            		 ciclo=true;
				            	 }
				            	 
		            		}while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos existentes");
	            	 }
	            	 break;
	             case 11:
	            	 if(!procesos.estaVacioAlumnos()&&!procesos.estaVacioCarreras()) {
	            		 do {
	            			 System.out.println(procesos.getCarreras());
	            			 System.out.println("Escriba el nombre de la carrera: ");
			            	 dato=scanner.nextLine();
			            	 if(procesos.devolverCarrera(dato)!=null ) {
			            		do {
			            			do {
				            			 System.out.println("Ingrese el numero del semestre que quiere obtener el promedio(1, 2, 3...): ");
				            			 semestre = scanner.nextLine();
						            	 procesos.promedioDeTodosLosAlumnosDelSemestre(procesos.devolverCarrera(dato), Integer.parseInt(semestre));
						            	 ciclo=false;
			            			 }while(ciclo);
					            	 
			            		}while(ciclo);
			            	 }else {
			            		 System.out.println("La carrera no existe");
			            		 ciclo=true;
			            	 }
			            	 
		            	 }while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos/carreras existentes");
	            	 }
	            	 //	                 obtenerPromedioSemestreAlumno();
	            	 break;
	             case 12:
	            	 if(!procesos.estaVacioAlumnos()&&!procesos.estaVacioCarreras()) {
	            		 do {
	            			 System.out.println(procesos.getCarreras());
	            			 System.out.println("Escriba el nombre de la carrera: ");
			            	 dato=scanner.nextLine();
			            	 if(procesos.devolverCarrera(dato)!=null ) {
			            				System.out.println(procesos.getMateriasDeLaCarrera(procesos.devolverCarrera(dato)));
				            			 System.out.println("Ingrese el numero del semestre de la materia que quiere obtener el promedio(1, 2, 3...): ");
				            			 semestre = scanner.nextLine();
				            			 do {
				            				 System.out.println("Ingrese el nombre de la materia que quiere obtener el promedio: ");
				            				 
					            			 nombre = scanner.nextLine();
				            				 if(procesos.validarMaterias(nombre)!=null ) {
							            		System.out.println(procesos.promedioDeLaMateriaDeTodosLosAlumnosDelSemestre(procesos.devolverCarrera(dato), Integer.parseInt(semestre), nombre));
								            	 ciclo=false;
							            	 }else {
							            		 System.out.println("La materia no existe");
							            		 ciclo=true;
							            	 }

					            		 }while(ciclo);
			            	 }else {
			            		 System.out.println("La carrera no existe");
			            		 ciclo=true;
			            	 }
			            	 
		            	 }while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos/carreras existentes");
	            	 }
//	                 obtenerPromedioPorMateriaCarrera();
	                 break;
	             case 13:
	            	 if(!procesos.estaVacioAlumnos()&&!procesos.estaVacioCarreras()) {
	            		 do {
	            			 System.out.println(procesos.getCarreras());
	            			 System.out.println("Escriba el nombre de la carrera: ");
			            	 dato=scanner.nextLine();
			            	 if(procesos.devolverCarrera(dato)!=null ) {
			            		System.out.println(procesos.promedioDeLaCarrera(procesos.devolverCarrera(dato)));
			            	 }else {
			            		 System.out.println("La carrera no existe");
			            		 ciclo=true;
			            	 }
			            	 
		            	 }while(ciclo);
	              	 }else {
	            		 System.out.println("No hay alumnos/carreras existentes");
	            	 }
//	                 obtenerPromedioPorCarrera();
	                 break;
	             case 14:
	                 System.out.println("Adios...");
	                 break;
	             default:
	                 System.out.println("Opción inválida. Inténtelo de nuevo.");
	         }
	     } while ( Integer.parseInt(opcion)!=14);
	     
	     scanner.close();
	 }
	}

