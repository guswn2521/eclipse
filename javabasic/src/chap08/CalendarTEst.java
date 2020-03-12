package chap08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTEst {

	public static void main(String[] args) {
		Calendar myCalendar = Calendar.getInstance();
		//System.out.println(myCalendar.getTime());
		myCalendar.set(Calendar.YEAR,2020);
		myCalendar.set(Calendar.MONTH, 3);
		myCalendar.set(Calendar.DAY_OF_MONTH,12);
		myCalendar.set(Calendar.MINUTE,25);
		myCalendar.set(Calendar.SECOND,30);
		String dfs = "yyyy:MM:dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(dfs);
		DateFormat df = DateFormat.getDateInstance();
		Date date  = myCalendar.getTime();
		
		System.out.println(sdf.format(date));
		System.out.println(df.format(date));
		
		
//		myCalendar.set(2020, 3, 12);
//		System.out.println(myCalendar.getTime());

	}

}
