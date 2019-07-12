package util_ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // new 가 아니라 getInstance() 메소드 생성
		// get(상수); 상수 값에 따라 원하는 데이터가 리턴 
		System.out.println("Calendar 클래스를 이용한 시간과 날짜 출력");
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.HOUR) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		// 1 일 2월 3화 4수 5목 6금 7토
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");
		 
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd E HH:mm:ss");
		String msg = sf.format(cal.getTime());
		System.out.println(msg);
	}

}
