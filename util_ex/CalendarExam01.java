package util_ex;

import java.util.Calendar;

public class CalendarExam01 {

	public static void main(String[] args) {
		//�ΰ��� calendar ��ü�� �����ϰ�
		//���� �ϳ��� ������ ���ϴ� ������� set�ؼ� after�޼ҵ�� ���� ����� ����Ͻÿ�.
		
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
			System.out.println(" cal�� cal2������ �ð� ");
		}else {
			System.out.println(" cal�� cal2������ �ð��� �ƴ� ");
		}
	}
}