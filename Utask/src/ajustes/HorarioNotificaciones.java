package ajustes;

import calendar.MyDateTime;

public class HorarioNotificaciones extends Notificacion {

	
	public boolean isNotificaciones() {
		
		return false;
	}

	@Override
	public void setNotificaciones(boolean notificaciones) {
		
		this.notificaciones = notificaciones;
		
	}

	
	public String getAsignaturas() {
		
		return null;
	}

	
	public void setAsignaturas(String asignaturas) {
		
		switch(asignaturas){
		case "5 mins antes": this.asignaturas = asignaturas;
		case "10 mins antes": this.asignaturas = asignaturas;
		case "30 mins antes": this.asignaturas = asignaturas;
		case "1 hora antes": this.asignaturas = asignaturas;
		case "2 horas antes": this.asignaturas = asignaturas;
		case "5 horas antes": this.asignaturas = asignaturas;
		case "1 día antes": this.asignaturas = asignaturas;
		case "2 días antes": this.asignaturas = asignaturas;
		
		default: this.asignaturas = "10 mins antes";
		}
	}

	
	public MyDateTime getDefaultnoti() {
		
		return null;
	}

	
	public void setDefaultnoti(MyDateTime defaultnoti) {
		
		
	}

}
