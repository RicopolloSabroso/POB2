package edu.udelp.poo;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.udelp.poo.model.Persona;
import edu.udelp.poo.util.Archivos;

public class App {
  public static void main(String[] args) {
    Persona p= new Persona();
    Persona n= new Persona();
    String filePath="C:\\Users\\sebas\\Documents\\person.json";
    p.setNombre("Emiliano Ricoy");
    n.setNombre(" Ricoy");
    p.setSexo('m');
    List<Persona> listP=new ArrayList<>();
    listP.add(p);
    listP.add(n);
    Archivos.guardaArchivo(Persona.class.getName(), listP);
    List<Persona> listaPersona=Archivos.leerArchivo(Persona.class.getName());
	System.out.println(listaPersona);
  }
}
