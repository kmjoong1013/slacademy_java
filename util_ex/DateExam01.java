package util_ex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExam01 {

	public static void main(String[] args) {
		int y,m,d;
		Scanner in = new Scanner(System.in);
		System.out.println("��");
		y = in.nextInt();
		System.out.println("��");
		m = in.nextInt();
		System.out.println("��");
		d = in.nextInt();
		
		Date date = new Date((y-1900) , (m-1) , d, 0, 0, 0);
		// SimpleDateFormat�� �̿��ؼ�  ����� ������ ����Ͻÿ�.
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy�� MM�� dd�� E");
		String msg = sf.format(date);
		System.out.println(msg);
	}
}
