package baseDeDatos.beans;

import calendar.MyDateTime;

public class Estudiante {
	
	private int idEstudiante;
	private String nombre;
	private MyDateTime fechaNacimiento;
	private String carrera;
	private String email;
	private String ciudadOrigen;
	private Usuario usuario;

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MyDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(MyDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

}
