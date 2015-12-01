package ajustes;
import calendar.*;

public abstract class Notificacion {

	protected boolean notificaciones;
	protected String asignaturas;
	protected MyDateTime defaultnoti;
	

	public abstract boolean isNotificaciones();
	
	public abstract void setNotificaciones(boolean notificaciones);

	public abstract String getAsignaturas();

	public abstract void setAsignaturas(String asignaturas);

	public abstract MyDateTime getDefaultnoti();

	public abstract void setDefaultnoti(MyDateTime defaultnoti);
}
