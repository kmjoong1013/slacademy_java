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
		
		// Ű����� ��¥�� �Է� �޾� SimpldateFormat���� Date ���·� �������� 
		// stDate ~ edDate ���̿� �ִ��� stDate ���� ���� edDate �������� ����Ͻÿ�.
		
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
			System.out.println(inDate+"�� " + stDateStr+"���� �Դϴ�.");
		}else if (cal.after(edDate) && !cal.equals(edDate)) {
			System.out.println(inDate+"�� " + edDateStr+"���� �Դϴ�.");
		}else {
			System.out.println(inDate+"�� " + stDateStr + "~" + edDateStr+"���̿� �ֽ��ϴ�.");
		}
	}
}
