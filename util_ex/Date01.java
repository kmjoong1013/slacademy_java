package util_ex;

import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		Date d = new Date();
		long curTime = d.getTime();
		System.out.println(1980+d.getYear()+"��");
		System.out.println(1+d.getMonth()+"��");
		System.out.println(d.getDate()+"��");
		System.out.println(d.getHours() + "��");
		System.out.println(d.getMinutes() + "��");
		System.out.println(d.getSeconds() + "��");
		// ��0��1ȭ2��3��4��5��6
		System.out.println("����" + d.getDay());
		
		Date d2 = new Date();
		d2.setYear(2011 - 1900);
		d2.setMonth(11 - 1);
		d2.setDate(20);
		d2.setHours(13);
		d2.setMinutes(30);
		d2.setSeconds(7);
		System.out.println(1900 +d2.getYear() + "��");
		System.out.println(1+ d2.getMonth() + "��"); // 0~11
		System.out.println(d2.getDate() + "��");
		System.out.println(d2.getHours() + "��");
		System.out.println(d2.getMinutes() + "��");
		System.out.println(d2.getSeconds() + "��");
	}
}