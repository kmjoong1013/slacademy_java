package util_ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormat01 {

	public static void main(String[] args) throws Exception {
		String dateStr = "20140506";
		// string�� substring�� �̿��ؼ� ������� �и��ϰ�  Integer.parseInt�� 
		// int������ ��ȯ��  cal.set(y,m,d); 
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		Date date = sf.parse(dateStr);//���ڿ��� yyyyMMdd ���˴�� �ؼ��ؼ� Date ��ü ����
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		 System.out.println(sf.format(cal.getTime()));
	}
}
