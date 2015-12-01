package calendar;

public class MyDate {
	int variableDeInstancia = 0;
	
	// Atributos
	private int day = 1,
				month = 1,
				year = 1900;
	protected int format = 2;
	private String monthName = "";
	
	// Variable auxiliar para control y validaci�n de los d�as de cada mes y a�os bisiestos.
	private int maxDays = 31;
	
	// Constructor, crea la fecha dd/mm/yyyy
	public MyDate(int dd, int mm, int yy){
		this.setYear(yy);
		this.setMonth(mm);
		this.setDay(dd);		
	}
	/* Crea la fecha 1/1/2010
	 * Se apoya de MyDate(int, int, int)
	 */
	public MyDate(){
		this(1,1,2010);
	}
	// Recibe el d�a dd y lo asigna a day despu�s de validarlo
	public void setDay(int dd){
		switch(this.month){
		// Si no se especifica una sentencia a un case y �ste no tiene un break �stos har�n lo que el primer case que s� tenga sentencias.
		// Es como si estuvi�ramos diciendo que este case 4, case 6 y case 9 har�n lo que dice case 11.
		case 4:
		case 6:
		case 9:
		case 11:
			maxDays = 30;
			this.day = (dd >= 1 && dd <= maxDays) ? dd : this.day;
			break;
		case 2:
			maxDays = (esBisiesto(this.year)? 29 : 28);
			this.day = (dd >= 1 && dd <= maxDays) ? dd : this.day;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			maxDays = 31;
			this.day = (dd >= 1 && dd <= maxDays) ? dd : this.day;
			break;
		default:
			this.day = 1;
			break;
		}
	}
	
	// Recibe el mes mm y lo asigna a month despu�s de validarlo
	public void setMonth(int mm){
		// Valida que el n�mero de mes est� dentro de los meses del a�o (1 al 12)
		this.month = (mm >= 1 && mm <= 12) ? mm : this.month;
		switch(this.month){
			case 1: monthName = "Enero"; maxDays = 31; break;
			case 2: monthName = "Febrero"; maxDays = (esBisiesto(this.year)? 29 : 28); break;
			case 3: monthName = "Marzo"; maxDays = 31; break;
			case 4: monthName = "Abril"; maxDays = 30; break;
			case 5: monthName = "Mayo"; maxDays = 31; break;
			case 6: monthName = "Junio"; maxDays = 30; break;
			case 7: monthName = "Julio"; maxDays = 31; break;
			case 8: monthName = "Agosto"; maxDays = 31; break;
			case 9: monthName = "Septiembre"; maxDays = 30; break;
			case 10: monthName = "Octubre"; maxDays = 31; break;
			case 11: monthName = "Noviembre"; maxDays = 30; break;
			case 12: monthName = "Diciembre"; maxDays = 31; break;
			default: monthName = ""; maxDays = 31; break;
		}
		
		// Valida que el n�mero de d�as del mes seleccionado sea v�lido, si no, asigna el �ltimo del mes, por default.
		this.day = (this.day > maxDays ? maxDays : this.day );
	}
	
	// Recibe el a�o yy y lo asigna a year despu�s de validarlo
	public void setYear(int yy){
		this.year = (yy >= 1900 && yy <= 3000) ? yy : this.year;
	}
	
	// Devuelve el valor actual de day
	public int getDay(){
		return this.day;
	}

	// Devuelve el valor actual de month
	public int getMonth(){
		return this.month;
	}

	// Devuelve el valor actual de year
	public int getYear(){
		return this.year;
	}
	
	// Actualiza el formato de la fecha actual
	public void setFormat(int f){
		this.format = (format >= 0 && format <=2) ? f : this.format;
	}
	
	/* Devuelve:
	 * �05/10/06�, si format = 0
	 * �5-oct-1987� si format = 1
	 * �5 de octubre de 1987�, si format = 2
	 */
	public String toString(){		
		switch (this.format){
		case 0:
			String sFormat = "";
			sFormat += (day < 10 ? "0" : "") + this.day + "/";
			sFormat += (month < 10 ? "0" : "") + this.month + "/";
			return sFormat += (this.year + "").toString().substring(2,4);
			
		case 1:
			return this.day + "-" + this.monthName.substring(0,3).toLowerCase() + "-" + this.year;
		case 2:
			return this.day 		+ " de " +
				   this.monthName	+ " de " +
				   this.year;
		default: return "";
		}
	}
	
	/* Devuelve true, si el d�a, mes y a�o de la clase
	 * 	son iguales al d�a, mes y a�o de o
	 * 	false, en otro caso.
	 */
	public boolean equals(Object o){
		// instanceof checa si el objeto recibido es una instancia de la clase MyDate
		if (o instanceof MyDate) {
			MyDate myDate = (MyDate) o;
			return (this.day 	== myDate.day)	&& 
				   (this.month 	== myDate.month)&&
				   (this.year 	== myDate.year);/* &&
				   (this.format == myDate.format);*/
		}
		return false;
	}
	
	/* Devuelve: un objeto de tipo MyDate con los
	 *	mismos valores que la clase.
	
	public MyDate clone(){
		MyDate dateClone = new MyDate(this.day, this.month, this.year);
		dateClone.setFormat(this.format);
		return dateClone;
	}
	
	/* Calcula los valores de los atributos
	 * 	que denotan el día siguiente. 
	 */
	public void next(){
		int dd = this.day,
			mm = this.month,
			yy = this.year;
		
		if (++dd > maxDays){
			this.setDay(1);
			if(++mm > 12){
				this.setMonth(1);
				if (++yy > 3000)
					this.setYear(2009);
				else 
					this.setYear(yy);
			} else 
				this.setMonth(mm);
		} else 
			this.setDay(dd);
	}
	
	private boolean esBisiesto(int yy){
		/* Un a�o es bisiesto si es divisible por 4, 
		 * 	excepto el último de cada siglo (aquel divisible por 100),
		 * 	salvo que éste último sea divisible por 400.
		 */
		return (((yy % 4 == 0) && !(yy % 100 == 0)) || (yy % 400 == 0));
	}

}