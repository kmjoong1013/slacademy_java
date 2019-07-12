package util_ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.MONTH,1);
		cal.add(Calendar.DATE,1);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		
		String msg = sf.format(cal.getTime());
		System.out.println(msg);
	}
}
