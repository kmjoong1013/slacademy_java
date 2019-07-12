package util_ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarExam02 {

	public static void main(String[] args) throws Exception {
		Calendar stDate = Calendar.getInstance();
		Calendar edDate = Calendar.getInstance();
		
		stDate.set(2019, 7, 15); 
		edDate.set(2019, 7, 17);
		
		// 키보드로 날짜를 입력 받아 SimpldateFormat으로 Date 형태로 변경한후 
		// stDate ~ edDate 사이에 있는지 stDate 이전 인지 edDate 이후인지 출력하시오.
		
		Scanner in = new Scanner(System.in);
		System.out.println("YYYYMMDD");
		String ymd = in.next();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		Date date = sf.parse(ymd);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		String stDateStr = sf.format(stDate.getTime());
		String edDateStr = sf.format(edDate.getTime());
		String inDate = sf.format(cal.getTime());
		
		boolean chk = cal.equals(stDate);
		System.out.println("chk:"+chk);
		if(cal.before(stDate) ) {
			System.out.println(inDate+"는 " + stDateStr+"이전 입니다.");
		}else if (cal.after(edDate) && !cal.equals(edDate)) {
			System.out.println(inDate+"는 " + edDateStr+"이후 입니다.");
		}else {
			System.out.println(inDate+"는 " + stDateStr + "~" + edDateStr+"사이에 있습니다.");
		}
	}
}
