package planeacion;

import java.util.Vector;
import calendar.MyDateTime;

public class Examen {
private String nombre;
private MyDateTime inicio;
private MyDateTime fin;

private String ubicacion;
private Vector<Profesor> profesores;

public Examen(){
	
}

public Examen(String nombre, MyDateTime inicio, MyDateTime fin){
	this.nombre=nombre;
	this.inicio=inicio;
	this.fin=fin;
}

public Examen(String nombre, MyDateTime inicio, MyDateTime fin, String ubicacion){
	this(nombre, inicio, fin);
	this.ubicacion=ubicacion;
}

public Examen(String nombre, MyDateTime inicio, MyDateTime fin, String ubicacion, Vector<Profesor> profesores){
	this(nombre, inicio, fin, ubicacion);
	this.profesores=profesores;
}

public String getNombre() {
	return this.nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public MyDateTime getInicio() {
	return this.inicio;
}

public void setInicio(MyDateTime inicio) {
	this.inicio = inicio;
}

public MyDateTime getFin() {
	return this.fin;
}

public void setFin(MyDateTime fin) {
	this.fin = fin;
}

public String getUbicacion() {
	return this.ubicacion;
}

public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}

public Vector<Profesor> getProfesores() {
	return this.profesores;
}

public void setProfesores(Vector<Profesor> profesores) {
	this.profesores = profesores;
}


}
