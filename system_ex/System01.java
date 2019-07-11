package system_ex;

import java.text.SimpleDateFormat;

public class System01 {

	public static void main(String[] args) {
		//system.in 기본 입력장치
		//system.err 에러출력장치
		//system.out 기본출력장치
		
		long ctime = System.currentTimeMillis();
		System.out.println(ctime);
		System.out.println(ctime/(1000*60));
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String stime = sf.format(ctime);
		System.out.println(stime);
	}
}
