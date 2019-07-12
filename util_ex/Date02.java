package util_ex;

import java.sql.Date;
import java.util.*;

public class Date02 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		
		d2.setYear(108); // 2008년 
		d2.setMonth(6); // 7월
		d2.setDate(10); // 10일 
		
		if (d1.after(d2)) {
			System.out.println("d1이 d2이후의 날짜");
		}else {
			System.out.println("d1이 d2이후의 날짜가 아님");
		}
	}
}
