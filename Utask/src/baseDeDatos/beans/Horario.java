package baseDeDatos.beans;

import java.util.Vector;

import planeacion.Clase;
import planeacion.Examen;
import tareas.Tarea;

public class Horario {
	
	private int idHorario;
	private String nombre;
	private Vector<Clase> clasesRegulares;
	private Vector<Clase> claseUv;
	private Vector<Examen> examenes;
	private Vector<Tarea> tareas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public Vector<Clase> getClasesRegulares() {
		return clasesRegulares;
	}

	public void setClasesRegulares(Vector<Clase> clasesRegulares) {
		this.clasesRegulares = clasesRegulares;
	}

	public Vector<Clase> getClaseUv() {
		return claseUv;
	}

	public void setClaseUv(Vector<Clase> claseUv) {
		this.claseUv = claseUv;
	}

	public Vector<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(Vector<Examen> examenes) {
		this.examenes = examenes;
	}

	public Vector<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(Vector<Tarea> tareas) {
		this.tareas = tareas;
	}

}
