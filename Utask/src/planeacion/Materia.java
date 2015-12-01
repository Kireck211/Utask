package planeacion;
import java.util.Vector;


public class Materia {
private String nombre;
private String color; //en lugar de String es ColorRGB
private int hoursLeft;
private int assignmentLeft;
protected Vector <Horario> horarios; 

public void setNombre(String n){
	this.nombre=n;
}

public void setColor(int r, int g, int b){
	
}

public int getHoursLeft(){
	return this.hoursLeft;
}

public int getAssignmentLeft(){
	return this.assignmentLeft;
}

public String getNombre(){
	return this.nombre;
}

public String getColor(){ //En lugar de String es ColorRGB
	return this.color;
}





}
