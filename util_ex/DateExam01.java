package util_ex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExam01 {

	public static void main(String[] args) {
		int y,m,d;
		Scanner in = new Scanner(System.in);
		System.out.println("년");
		y = in.nextInt();
		System.out.println("월");
		m = in.nextInt();
		System.out.println("일");
		d = in.nextInt();
		
		Date date = new Date((y-1900) , (m-1) , d, 0, 0, 0);
		// SimpleDateFormat을 이용해서  년월일 요일을 출력하시오.
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		String msg = sf.format(date);
		System.out.println(msg);
	}
}
