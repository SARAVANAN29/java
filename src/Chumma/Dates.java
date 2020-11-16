package Chumma;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {
	private static String fromDate;
	public static void main(String[] args) throws ParseException {
	String string = getDate("3/4/2018");
	System.out.println(string);
	
	}
	public static String getDate(String xpath) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date;
		Long l = simpleDateFormat.parse(xpath).getTime();
		date = new Date(l);
		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -2);
		calendar.getTime().toString();
		date = calendar.getTime();
		fromDate = simpleDateFormat.format(date).toString();
		return fromDate;
	}
}



//Date date;
//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//Calendar calendar = Calendar.getInstance();
//calendar.add( Calendar.DATE, 2 );
//date = calendar.getTime();
//String currentMonth = dateFormat.format( date ).toString();
//
//calendar.add( Calendar.MONTH, -1 );
//date = calendar.getTime();
//String prevMonth = dateFormat.format( date ).toString();
