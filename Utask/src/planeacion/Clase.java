package planeacion;

import java.util.Vector;

import javax.swing.JOptionPane;

import calendar.MyDateTime;

class Repetir{
	public String repeticiones;
	public int cantidad;
}

public class Clase {
	private String nombre;
	private Vector<Profesor> profesores;
	private MyDateTime inicio;
	private MyDateTime fin;
	private Repetir repeticion;
	private boolean[] dSemana = new boolean[7];
	private String ubicacion;
	private Vector<Examen> examenes;

	public Clase() {

	}

	public Clase(MyDateTime inicio, MyDateTime fin, boolean[] dSemana, String nombre) {
		if (puedeAgregar(inicio, fin)) {
			this.inicio = inicio;
			this.fin = fin;
			this.dSemana = dSemana;
			this.nombre = nombre;
		} else
			JOptionPane.showMessageDialog(null, "Ingrese una fecha válida");

	}

	public Clase(MyDateTime inicio, MyDateTime fin, Repetir repeticion, boolean[] dSemana, String nombre) {
		this(inicio, fin, dSemana, nombre);
		if (puedeAgregar(inicio, fin)) {
			this.repeticion = repeticion;
		} else
			JOptionPane.showMessageDialog(null, "Ingrese una fecha válida");

	}

	public Clase(MyDateTime inicio, MyDateTime fin, Repetir repeticion, boolean[] dSemana, String nombre,
			String ubicacion) {
		this(inicio, fin, repeticion, dSemana, nombre);
		if (puedeAgregar(inicio, fin))
			this.ubicacion = ubicacion;
		else
			JOptionPane.showMessageDialog(null, "Ingrese una fecha válida");

	}

	public Clase(MyDateTime inicio, MyDateTime fin, Repetir repeticion, boolean[] dSemana, String nombre,
			String ubicacion, Vector<Profesor> profesores) {
		this(inicio, fin, repeticion, dSemana, nombre, ubicacion);
		this.profesores = profesores;
	}

	public boolean puedeAgregar(MyDateTime inicio, MyDateTime fin) {
		int duracion = inicio.getDuracion(fin);
		if (duracion > 0)
			return true;
		else
			return false;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Profesor> getProfesores() {
		return this.profesores;
	}

	public void setProfesores(Vector<Profesor> profesores) {
		this.profesores = profesores;
	}

	public MyDateTime getInicio() {
		return this.inicio;
	}

	public void setInicio(MyDateTime inicio) {
		this.inicio = inicio;
	}

	public MyDateTime getFin() {
		return this.fin;
	}

	public void setFin(MyDateTime fin) {
		this.fin = fin;
	}

	public Repetir getRepeticion() {
		return this.repeticion;
	}

	public void setRepeticion(Repetir repeticion) {
		this.repeticion = repeticion;
	}

	public boolean[] getdSemana() {
		return this.dSemana;
	}

	public void setdSemana(boolean[] dSemana) {
		this.dSemana = dSemana;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Vector<Examen> getExamenes() {
		return this.examenes;
	}

	public void setExamenes(Vector<Examen> examenes) {
		this.examenes = examenes;
	}

}
