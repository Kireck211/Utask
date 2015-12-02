package baseDeDatos.beans;

import java.util.Vector;

import calendar.MyDateTime;
import planeacion.Examen;
import planeacion.Profesor;

public class Clase {
	private int idClase;
	private String nombre;
	private Vector<Profesor> profesores;
	private MyDateTime inicio;

	private MyDateTime fin;
	private Repetir repeticion;
	private boolean[] dSemana = new boolean[7];
	private String ubicacion;
	private Vector<Examen> examenes;

	public int getIdClase() {
		return idClase;
	}

	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}

	public Vector<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(Vector<Profesor> profesores) {
		this.profesores = profesores;
	}

	public Repetir getRepeticion() {
		return repeticion;
	}

	public void setRepeticion(Repetir repeticion) {
		this.repeticion = repeticion;
	}

	public Vector<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(Vector<Examen> examenes) {
		this.examenes = examenes;
	}

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
