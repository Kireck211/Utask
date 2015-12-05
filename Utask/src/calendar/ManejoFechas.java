package calendar;

import java.util.Vector;

public class ManejoFechas {
	
	public static void forLoop(int max, Vector<String>dias) {
		for(int i =0;i < max; i++) {
			dias.addElement(((Integer)i).toString());
		}
	}
	
	public static Vector<String> getMes(int mes, boolean isLeapYear, Vector<String>dias) {
		switch(mes){
		case 1:  // Enero
			forLoop(31, dias);
		case 2:  // Febrero
			if (isLeapYear)
				forLoop(29,dias);
			else
				forLoop(28,dias);
		case 3:  // Marzo
			forLoop(31,dias);
		case 4:  // Abril
			forLoop(30,dias);
		case 5:  // Mayo
			forLoop(31,dias);
		case 6:  // Junio
			forLoop(30,dias);
		case 7:  // Julio
			forLoop(31,dias);
		case 8:  // Agosto
			forLoop(31,dias);
		case 9:  // Septiembre
			forLoop(30,dias);
		case 10:  // Octubre
			forLoop(31,dias);
		case 11:  // Noviembre
			forLoop(30,dias);
		default:  // Diciembre
			forLoop(31,dias);
		}
		return dias;
	}
}
