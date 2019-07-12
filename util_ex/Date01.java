package util_ex;

import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		Date d = new Date();
		long curTime = d.getTime();
		System.out.println(1980+d.getYear()+"년");
		System.out.println(1+d.getMonth()+"월");
		System.out.println(d.getDate()+"일");
		System.out.println(d.getHours() + "시");
		System.out.println(d.getMinutes() + "분");
		System.out.println(d.getSeconds() + "초");
		// 일0월1화2수3목4금5토6
		System.out.println("요일" + d.getDay());
		
		Date d2 = new Date();
		d2.setYear(2011 - 1900);
		d2.setMonth(11 - 1);
		d2.setDate(20);
		d2.setHours(13);
		d2.setMinutes(30);
		d2.setSeconds(7);
		System.out.println(1900 +d2.getYear() + "년");
		System.out.println(1+ d2.getMonth() + "월"); // 0~11
		System.out.println(d2.getDate() + "일");
		System.out.println(d2.getHours() + "시");
		System.out.println(d2.getMinutes() + "분");
		System.out.println(d2.getSeconds() + "초");
	}
}