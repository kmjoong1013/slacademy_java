package util_ex;

import java.util.Calendar;

public class CalendarExam01 {

	public static void main(String[] args) {
		//두개의 calendar 객체를 생성하고
		//둘중 하나에 본인이 원하는 년월일을 set해서 after메소드로 비교한 결과를 출력하시오.
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println("YEAR " + cal.get(Calendar.YEAR));
		System.out.println("MONTH " + (cal.get(Calendar.MONTH)+1));
		System.out.println("DATE " + cal.get(Calendar.DATE));
		
		cal2.set(1995, 10, 13,0,0,0);
		
		System.out.println("YEAR " + cal2.get(Calendar.YEAR));
		System.out.println("MONTH " + (cal2.get(Calendar.MONTH)));
		System.out.println("DATE " + cal2.get(Calendar.DATE));
		if(cal.after(cal2)){
			System.out.println(" cal이 cal2이후의 시간 ");
		}else {
			System.out.println(" cal이 cal2이후의 시간이 아님 ");
		}
	}
}