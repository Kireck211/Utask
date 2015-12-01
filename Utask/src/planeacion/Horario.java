package planeacion;

import java.util.Vector;
import tareas.Tarea;


public class Horario {
private Vector<Clase> clasesRegulares;
private Vector<Clase> claseUv;
private Vector<Examen> examenes;
private Vector<Tarea> tareas;

public Vector<Clase> getClasesRegulares(){
	return this.clasesRegulares;
}

public Vector<Clase> getClaseUv(){
	return this.claseUv;
}

public Vector<Examen> getExamenes(){
	return this.examenes;
}

public Vector<Tarea> getTareas(){
	return this.tareas;
}


}
