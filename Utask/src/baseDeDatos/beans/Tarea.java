package baseDeDatos.beans;

public class Tarea {
	private int idTarea;
	private String nombre;
	private String asignatura;
	private String descripcion;
	private int realizada;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getRealizada() {
		return realizada;
	}

	public void setRealizada(int realizada) {
		this.realizada = realizada;
	}

	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

}
