package baseDeDatos.beans;

import java.util.Vector;

import planeacion.Clase;
import planeacion.Examen;
import tareas.Tarea;

public class Horario {
	private Vector<Clase> clasesRegulares;
	private Vector<Clase> claseUv;
	private Vector<Examen> examenes;
	private Vector<Tarea> tareas;
	
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
