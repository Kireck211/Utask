package baseDeDatos.beans;

import java.util.Vector;

import planeacion.Horario;

public class Materia {
	
	private int idMateria;
	private String nombre;
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

	public Vector<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Vector<Horario> horarios) {
		this.horarios = horarios;
	}

}
