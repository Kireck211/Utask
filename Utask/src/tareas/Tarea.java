package tareas;

import planeacion.Materia;
import ajustes.Notificacion;
import calendar.MyDateTime;

public class Tarea {

	private Materia asignatura;
	private String nombre;
	private String descripcion;
	private boolean realizada;
	private String prioridad;
// private Notificacion entrega;
// private MyDateTime fecha_entrega;
	
	public Tarea() {
		this.nombre = "Tarea sin Título";
		this.descripcion = "Sin descripción";
		this.realizada = false;
		this.prioridad = "Media";
	}

	public Tarea(Materia asignatura){
		this();
		this.asignatura = asignatura;
	//  this.entrega = ;
	//  this.fecha_entrega = ;
	}
	
	public Tarea(Materia asignatura, String nombre){
		this(asignatura);
		this.nombre = nombre;
		//this.entrega = ;
		//this.fecha_entrega = ;
	}
	
	public Tarea(Materia asignatura, String nombre, String descripcion){
		this(asignatura, nombre);
		this.descripcion = descripcion;
		//this.entrega = ;
		//this.fecha_entrega = ;
	}
	
	public Tarea(Materia asignatura, String nombre, String descripcion, boolean realizada){
		this(asignatura, nombre, descripcion);
		this.realizada = realizada;
		//this.entrega = ;
		//this.fecha_entrega = ;
	}
		
	public Tarea(Materia asignatura, String nombre, String descripcion, boolean realizada, String prioridad){
		this(asignatura, nombre, descripcion, realizada);
		this.prioridad = prioridad;
		//this.entrega = ;
		//this.fecha_entrega = ;
		
	}
	
	//Getters & Setters
	
	public void setAsignatura(Materia asignatura) {
		this.asignatura = asignatura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	/* public void setEntrega(Notificacion entrega) {
		this.entrega = entrega;
	} */

	public Materia getAsignatura() {
		return this.asignatura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public boolean getRealizada() {
		return this.realizada;
	}

	public String getPrioridad() {
		return this.prioridad;
	}

	/* public Notificacion getEntrega() {
		return this.entrega;
	} */

}
