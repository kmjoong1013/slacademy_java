package util_ex;

import java.sql.Date;
import java.util.*;

public class Date02 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		
		d2.setYear(108); // 2008�� 
		d2.setMonth(6); // 7��
		d2.setDate(10); // 10�� 
		
		if (d1.after(d2)) {
			System.out.println("d1�� d2������ ��¥");
		}else {
			System.out.println("d1�� d2������ ��¥�� �ƴ�");
		}
	}
}
