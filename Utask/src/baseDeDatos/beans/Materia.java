package baseDeDatos.beans;

import java.util.Vector;

import planeacion.Horario;

public class Materia {
	
	private int idMateria;
	private String nombre;
	private String color; // en lugar de String es ColorRGB
	private int hoursLeft;
	private int assignmentLeft;
	protected Vector<Horario> horarios;

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		this.hoursLeft = hoursLeft;
	}

	public int getAssignmentLeft() {
		return assignmentLeft;
	}

	public void setAssignmentLeft(int assignmentLeft) {
		this.assignmentLeft = assignmentLeft;
	}

	public Vector<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Vector<Horario> horarios) {
		this.horarios = horarios;
	}

}
