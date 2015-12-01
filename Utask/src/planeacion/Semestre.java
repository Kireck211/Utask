package planeacion;

import java.util.Vector;

import calendar.MyDate;


public class Semestre {
	
	private boolean activo;
	private String nombre;
	private MyDate inicio;
	private MyDate fin;
	private int duracion;
	private Vector<Materia> materias;

	public Semestre (MyDate inicio, MyDate fin){
		this.activo = true;
	}
	
	public Semestre (String nombre, MyDate inicio, MyDate fin){
		this(inicio, fin);
		this.nombre = nombre;
	}
	
	public int getDuracion(MyDate inicio, MyDate fin){
		return 0;
	}
	
	public void setActive(boolean estado){
		
	}
	
	public void setNombre(String nombre){
		
	}
	
	public void setInicio(MyDate fecha){
		
	}
	
	public void setFin(MyDate fecha){
		
	}
	
	public int calculateDuration(){
		return 0;
	}
	
	public boolean getActive(){
		return true;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public MyDate getInicio(){
		return this.inicio;
	}
	
	public MyDate getFinal(){
		return this.fin;
	}
	
	public Vector<Materia> getMaterias(){
		return this.materias;
	}
	
}
