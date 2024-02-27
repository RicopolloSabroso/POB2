package edu.udelp.poo.procesos;

import java.util.LinkedList;
import java.util.List;

import edu.udelp.poo.model.*;
import edu.udelp.poo.util.Archivos;

public class ProcesosEscuela {
	private List<Carrera> carreras;
	private List<Materia> materias=null;
	private List<Profesor> profesores=null;
	public List<Estudiante> alumnos=null;
	public void init() {
		this.carreras=Archivos.leerArchivo(Carrera.class.getName());
		this.materias=Archivos.leerArchivo(Materia.class.getName());
		this.profesores=Archivos.leerArchivo(Profesor.class.getName());
		this.alumnos=Archivos.leerArchivo(Estudiante.class.getName());
	}
	public boolean estaVacioMaterias() {
		return null==materias|| materias.isEmpty();
	}
	public boolean estaVacioCarreras() {
		return null==carreras || carreras.isEmpty();
	}
	public boolean estaVacioAlumnos() {

		return null==alumnos ||alumnos.isEmpty();
	}
	public boolean estaVacioProfesores() {

		return null==profesores || profesores.isEmpty();
	}
	public void darDeAltaCarreras(Carrera carrera)throws Exception{
		if(null==carrera) {
			throw new Exception("La carrera no puede ser nulo");
		}
		carreras.add(carrera);
		Archivos.guardaArchivo(Carrera.class.getName(), carreras);
	}
	public void darDeAltaMaterias(Materia materia)throws Exception{
		if(null==materia) {
			throw new Exception("La materia no puede ser nulo");
		}
		materias.add(materia);
		Archivos.guardaArchivo(Materia.class.getName(), materias);
	}
	public void darDeAltaProfesores(Profesor prof)throws Exception{
		if(null==prof) {
			throw new Exception("El profesor no puede ser nulo");
		}
		profesores.add(prof);
	}
	public void darDeAltaAlumnos(Estudiante alumno)throws Exception{
		if(null==alumno) {
			throw new Exception("El alumno no puede ser nulo");
		}
		alumnos.add(alumno);
	}
	public Carrera devolverCarrera(String nombre) throws Exception{
		if( null==carreras ) {
			throw new Exception("Debe existir la Carrera");
		}
		System.out.println(((Carrera)carreras.get(0)).getClass());
		for (Carrera x : carreras) {
			if(x.getNombre().equalsIgnoreCase(nombre)) {
				return x;
			}
		}
		return null;
	}
	public Materia validarMaterias(String nombre)throws Exception{
		if(null==materias ) {
			throw new Exception("Debe existir la materia");
		}
		for (Materia x : materias) {
			if(x.getNombre().equalsIgnoreCase(nombre)) {
				return x;
			}
		}
		return null;
	}
	public Estudiante buscarAlumnoPorID(int id) {
		for (Estudiante alumno : alumnos) {
			if (alumno.getId() == id) {
				return alumno;
			}
		}
		return null;
	}
	public Profesor buscarProfesorPorID(int id) {
		for (Profesor profesor : profesores) {
			if (profesor.getId() == id) {
				return profesor;
			}
		}
		return null;
	}
	public Materia buscarMateria(String nombreMateria) {
		for (Materia materia :materias) {
			if (materia.getNombre().equalsIgnoreCase(nombreMateria)) {
				return materia;
			}
		}
		return null; 
	}
	public boolean materiasAlumnoVacio(Estudiante alumno) {
		return alumno.getMaterias()==null?true:false; 
	}
	public void asignarMateriasProfesor(Integer id,Materia materia)throws Exception{
		if(null==materia|| null==profesores ) {
			throw new Exception("La materia no puede ser nulo o deben haber profesores enlistados");
		}
		for (Profesor profesor : profesores) {
			if(profesor.getId()==id){
				profesor.addMateria(materia);
			}
		} 
	}
	public void asignarCarreras(Integer id,Carrera carrera)throws Exception{
		if(null==carrera|| null==carreras ) {
			throw new Exception("Deben haber carreras enlistadas o no debe ser nula la carrera");
		}
		for (Estudiante x : alumnos) {
			if (x.getId()== id) {
				x.setCarrera(carrera);
				x.setMaterias(asignarMaterias(carrera));

			}
		}
	}
	private LinkedList<MateriaAlumno> asignarMaterias(Carrera carrera){
		LinkedList<MateriaAlumno> materiasAlumno=new LinkedList<>();
		for (Materia x : materias) {
			if (x.getCarrera().equals(carrera)) {
				materiasAlumno.add(new MateriaAlumno(x.getSemestre(),x.getHorario(),x.getNombre(), x.getCarrera()));

			}
		}
		return materiasAlumno;
	}
	public String getAlumnos() {
		String alumnosInfo="";
		for (Estudiante alumno : alumnos) {
			alumnosInfo=alumno.getInfo();
		}
		return alumnosInfo;
	}
	public String getAlumnosConMaterias() {
		String alumnosInfo="";
		for (Estudiante alumno : alumnos) {
			alumnosInfo=alumno.toString();
		}
		return alumnosInfo;
	}
	public void agregarCalificacion( Estudiante alumno,String nombreMateria, double primerParcial, double segundoParcial, double proyecto, double examenFinal) {
		for (Estudiante x : alumnos) {
			if (x.getId()== alumno.getId()) {
				List<MateriaAlumno>listaMaterias=x.getMaterias();
				for (MateriaAlumno m : listaMaterias) {
					if (m.getNombre().equalsIgnoreCase(nombreMateria)) {
						(m).setPrimerParcial(primerParcial);
						(m).setExamenFinal(examenFinal);
						(m).setSegundoParcial(segundoParcial);
						(m).setProyecto(proyecto);
						break;
					}
				}
			}
		}
	}
	public Materia validarMateriasAlumno(Estudiante alumno, String nombre)throws Exception{
		for (Materia x : alumno.getMaterias()) {
			if(x.getNombre().equalsIgnoreCase(nombre)) {
				return x;
			}
		}
		return null;
	}
	public String promedioPorMateriaAlumno(Estudiante alumno,String nombreMateria) {
		for (Estudiante x : alumnos) {
			if (x.getId()== alumno.getId()) {
				List<MateriaAlumno>listaMaterias=x.getMaterias();
				for (Materia m : listaMaterias) {
					if(((MateriaAlumno)m).getPrimerParcial()!=0) {
						if (m.getNombre().equalsIgnoreCase(nombreMateria)) {
							Double result=((MateriaAlumno)m).getPrimerParcial()+((MateriaAlumno)m).getSegundoParcial()+((MateriaAlumno)m).getProyecto()+((MateriaAlumno)m).getExamenFinal();
							return "Promedio de "+nombreMateria+" es: "+ result/4;
						}
					}
					
				}
			}
		}
		return null;
	}
	 public double calcularPromedio(LinkedList<Double> numeros) {
	        if (numeros == null || numeros.isEmpty()) {
	            return 0.0; 
	        }
	        double suma = 0;
	        for (Double numero : numeros) {
	            suma += numero;
	        }

	        return (double) suma / numeros.size();
	    }
	public String promedioPorSemestreDelAlumno(Estudiante alumno, int semestre) {
		LinkedList<Double> promedios=new LinkedList<>();
		String promedio="";
		for (Estudiante x : alumnos) {
			if (x.getId()== alumno.getId()) {
				promedio=x.getNombre()+" del Semestre "+semestre+"\n";
				List<MateriaAlumno>listaMaterias=x.getMaterias();
				for (Materia m : listaMaterias) {
					if(semestre==Integer.parseInt(m.getSemestre())&&((MateriaAlumno)m).getPrimerParcial()!=0) {
						if(m.getSemestre().equalsIgnoreCase(String.valueOf(semestre))) {
							Double result=((MateriaAlumno)m).getPrimerParcial()+((MateriaAlumno)m).getSegundoParcial()+((MateriaAlumno)m).getProyecto()+((MateriaAlumno)m).getExamenFinal();
							promedios.add(result/4);
							promedio+="Promedio de "+m.getNombre()+" en el semestre " +semestre+": "+result/4+"\n";
						}
					}
					
				}
				break;
			}
		}
		return promedio+"Promedio del semestre: "+calcularPromedio(promedios)+"\n";
		
	}
	public Double promedioPorSemestreDelAlumnoDoble(Estudiante alumno, int semestre) {
		LinkedList<Double> promedios=new LinkedList<>();
		for (Estudiante x : alumnos) {
			if (x.getId()== alumno.getId()) {
				List<MateriaAlumno>listaMaterias=x.getMaterias();
				for (Materia m : listaMaterias) {
					if(((MateriaAlumno)m).getPrimerParcial()!=0) {
						if(m.getSemestre().equalsIgnoreCase(String.valueOf(semestre))) {
							Double result=((MateriaAlumno)m).getPrimerParcial()+((MateriaAlumno)m).getSegundoParcial()+((MateriaAlumno)m).getProyecto()+((MateriaAlumno)m).getExamenFinal();
							promedios.add(result/4);
						}
					}
						
				}
				break;
			}
		}
		return calcularPromedio(promedios);
		
	}

	
	public List<Profesor> getProfesores() {
		return profesores;
	}
	public String promedioDeTodosLosAlumnosDelSemestre(Carrera carrera, int semestre) {
		String promedio="";
		for (Estudiante x : alumnos) {
			if (x.getCarrera().equals(carrera) && x.getSemestre()==semestre) {
				promedio+=promedioPorSemestreDelAlumno(x,semestre)+"\n";
			}
		}
		LinkedList<Double> promediosNum=new LinkedList<>();
		for (Estudiante x : alumnos) {
			if (x.getCarrera().equals(carrera) && x.getSemestre()==semestre) {
				promediosNum.add(promedioPorSemestreDelAlumnoDoble(x, semestre));
			}
		}
		return promedio+"Promedio del semestre de todos los alumnos: "+calcularPromedio(promediosNum);
		
	}
	public LinkedList<Materia> getMateriasDeLaCarrera(Carrera carrera) {
		LinkedList<Materia> mat=new LinkedList<>();
		for (Materia materia :materias) {
			if (materia.getCarrera().equals(carrera)) {
				mat.add(materia);
			}
			
		}
		return mat;
	}
	public List<Carrera> getCarreras() {
		return carreras;
	}
	public String promedioDeLaMateriaDeTodosLosAlumnosDelSemestre(Carrera carrera, int semestre,String nombreMateria) {
		LinkedList<Double> promedios=new LinkedList<>();
		for (Estudiante x : alumnos) {
			if (x.getCarrera().equals(carrera)) {
				List<MateriaAlumno>listaMaterias=x.getMaterias();
				for (Materia m : listaMaterias) {
					if (m.getNombre().equalsIgnoreCase(nombreMateria)&& Integer.parseInt( m.getSemestre())==semestre) {
						if(((MateriaAlumno)m).getPrimerParcial()!=0) {
							Double result=((MateriaAlumno)m).getPrimerParcial()+((MateriaAlumno)m).getSegundoParcial()+((MateriaAlumno)m).getProyecto()+((MateriaAlumno)m).getExamenFinal();
							promedios.add(result/4) ;
						}
					}
					
					
				}
			}
		}
		return "Promedio de la materia "+nombreMateria+" de todos los alumnos: "+calcularPromedio(promedios);
		
	}
	public String promedioDeLaCarrera(Carrera carrera) {
		LinkedList<Double> promediosAlumnos=new LinkedList<>();
		for (Estudiante x : alumnos) {
			if (x.getCarrera().equals(carrera)) {
				LinkedList<Double> promediosMaterias=new LinkedList<>();
				List<MateriaAlumno>listaMaterias=x.getMaterias();
				for (Materia m : listaMaterias) {
					if(((MateriaAlumno)m).getPrimerParcial()!=0) {
						Double result=((MateriaAlumno)m).getPrimerParcial()+((MateriaAlumno)m).getSegundoParcial()+((MateriaAlumno)m).getProyecto()+((MateriaAlumno)m).getExamenFinal();
						promediosMaterias.add(result/4);
					}
				}
				promediosAlumnos.add(calcularPromedio(promediosMaterias));
			}
		}
		return "Promedio de la Carrera de todos los alumnos: "+calcularPromedio(promediosAlumnos);
		
	}

}
	