package system_ex;

import java.text.SimpleDateFormat;

public class System01 {

	public static void main(String[] args) {
		//system.in �⺻ �Է���ġ
		//system.err ���������ġ
		//system.out �⺻�����ġ
		
		long ctime = System.currentTimeMillis();
		System.out.println(ctime);
		System.out.println(ctime/(1000*60));
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String stime = sf.format(ctime);
		System.out.println(stime);
	}
}
