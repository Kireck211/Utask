package baseDeDatos.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable
{
	//Atributos
	String nombre;
	ArrayList<String> listaProfesores;
	
	//Metodos
	
	public Persona()
	
	{
		
	}
	
	private void load()
	{
		FileInputStream ruta = new FileInputStream("");
		
		ObjectInputStream archivo = new ObjectInputStream(ruta);
		Persona temporal = (Persona) archivo.readObject();
		ruta.close();
		archivo.close();
	}
	
	private void save()
	{
		//Objeto que sabe escribir en una ruta en disco
		FileOutputStream rutaArchivo= new FileOutputStream("");
		
		//Objeto sabe escribir otros objetos en la ruta de "rutaArchivo"
		ObjectOutputStream archivo = new ObjectOutputStream(rutaArchivo);
		
		archivo.writeObject(this);
		
		archivo.close();
		
		rutaArchivo.close();
		
	}
	
}
