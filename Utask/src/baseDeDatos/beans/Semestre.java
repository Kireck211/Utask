package baseDeDatos.beans;

import java.util.Vector;

import calendar.MyDate;
import planeacion.Materia;

public class Semestre {

	private int idSemestre;
	private int activo;
	private String nombre;
	private MyDate inicio;
	private MyDate fin;

	public int getIdSemestre() {
		return idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MyDate getInicio() {
		return inicio;
	}

	public void setInicio(MyDate inicio) {
		this.inicio = inicio;
	}

	public MyDate getFin() {
		return fin;
	}

	public void setFin(MyDate fin) {
		this.fin = fin;
	}

	public Vector<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Vector<Materia> materias) {
		this.materias = materias;
	}

	private Vector<Materia> materias;

}
