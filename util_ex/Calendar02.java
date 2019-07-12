package util_ex;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println("YEAR " + cal.get(Calendar.YEAR));
		System.out.println("MONTH " + (cal.get(Calendar.MONTH)+1));
		System.out.println("DATE " + cal.get(Calendar.DATE));
		
		cal2.set(2012, 7, 12,0,0,0);
		
		System.out.println("YEAR " + cal2.get(Calendar.YEAR));
		System.out.println("MONTH " + (cal2.get(Calendar.MONTH)+1));
		System.out.println("DATE " + cal2.get(Calendar.DATE));
		
		if(cal.after(cal2)){
			System.out.println(" cal이 cal2이후의 시간 ");
		}else {
			System.out.println(" cal이 cal2이후의 시간이 아님 ");
		}
	}
}
