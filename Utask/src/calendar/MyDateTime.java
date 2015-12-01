package calendar;

public class MyDateTime extends MyDate {
	
	private int hours, minutes, seconds;

	public MyDateTime(MyDate md){
		super(md.getDay(), md.getMonth(), md.getYear());
	}
	
	public MyDateTime(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public MyDateTime(int day, int month, int year, int hours, int minutes) {
		super(day,month,year);
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public void next(){
		int hh = hours,
			mm = minutes,
			ss = seconds;
		
		if (++ss > 59){
			this.setSeconds(0);
			if(++mm > 59){
				this.setMinutes(0);
				if (++hh > 23){
					this.setHours(0);
					super.next();
				}else 
					this.setHours(hh);
			} else 
				this.setMinutes(mm);
		} else 
			this.setSeconds(ss);
	}
	public MyDate toDate(){
		return new MyDate(getDay(), getMonth(), getYear());
		//return super.clone();
	}
	
	public boolean equals(Object o){
		MyDateTime mdt = (MyDateTime) o;
		return mdt.hours == this.hours &&
			   mdt.minutes == this.minutes &&
			   mdt.seconds == this.seconds &&
			   super.equals(o);
	}
	
	public int getDuracion(MyDateTime time2) {
		
		return 0;
	}
}