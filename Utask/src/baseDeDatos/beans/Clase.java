package baseDeDatos.beans;

import java.util.Vector;

import calendar.MyDateTime;
import planeacion.Examen;
import planeacion.Profesor;

public class Clase {
	private String nombre;
	private Vector<Profesor> profesores;
	private MyDateTime inicio;
	private MyDateTime fin;
	private Repetir repeticion;
	private boolean[] dSemana = new boolean[7];
	private String ubicacion;
	private Vector<Examen> examenes;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public MyDateTime getInicio() {
		return inicio;
	}
	public void setInicio(MyDateTime inicio) {
		this.inicio = inicio;
	}
	public MyDateTime getFin() {
		return fin;
	}
	public void setFin(MyDateTime fin) {
		this.fin = fin;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public boolean[] getdSemana() {
		return dSemana;
	}
	public void setdSemana(boolean[] dSemana) {
		this.dSemana = dSemana;
	}
	
}
