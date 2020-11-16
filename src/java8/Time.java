package java8;

import java.util.Date;

public class Time {
	
	private Date date;
	
	public Time() {
		this.date = new Date();
	}

	public Date getDate() {
//		LocalDateTime ldt = LocalDateTime.now();
//		ldt.format(formatter)
//		LocalDate ld = LocalDate.now();
//		ld.format(formatter)
//		Instant timestamp = Instant.now();
		return date;
	}

	@Override
	public String toString() {
		return "Time [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
	}
}
