package util_ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date03 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(111,7,1,0,0,0);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		String d1Str = sf.format(d1);
		String d2Str = sf.format(d2);
		
		System.out.println("d1Str:"+d1Str);
		System.out.println("d2Str:"+d2Str);
	}
}
