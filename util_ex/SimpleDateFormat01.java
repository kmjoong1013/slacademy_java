package util_ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat01 {

	public static void main(String[] args) throws Exception {
		String dateStr = "20140506";
		// string의 substring을 이용해서 년월일을 분리하고  Integer.parseInt로 
		// int형으로 변환후  cal.set(y,m,d); 
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		Date date = sf.parse(dateStr);//문자열을 yyyyMMdd 포맷대로 해석해서 Date 객체 리턴
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		 System.out.println(sf.format(cal.getTime()));
	}
}
