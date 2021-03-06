package baseDeDatos.beans;

import calendar.MyDateTime;

public class Examen {
	private int idExamen;

	private String nombre;
	private MyDateTime inicio;
	private MyDateTime fin;
	private String ubicacion;

	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
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

}
