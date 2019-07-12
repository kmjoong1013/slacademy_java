package util_ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // new �� �ƴ϶� getInstance() �޼ҵ� ����
		// get(���); ��� ���� ���� ���ϴ� �����Ͱ� ���� 
		System.out.println("Calendar Ŭ������ �̿��� �ð��� ��¥ ���");
		System.out.println(cal.get(Calendar.YEAR) + "��");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "��");
		System.out.println(cal.get(Calendar.DATE) + "��");
		System.out.println(cal.get(Calendar.HOUR) + "��");
		System.out.println(cal.get(Calendar.MINUTE) + "��");
		System.out.println(cal.get(Calendar.SECOND) + "��");
		// 1 �� 2�� 3ȭ 4�� 5�� 6�� 7��
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "����");
		 
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd E HH:mm:ss");
		String msg = sf.format(cal.getTime());
		System.out.println(msg);
	}

}
