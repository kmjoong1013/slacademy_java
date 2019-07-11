package system_ex;

public class System02 {

	public static void main(String[] args) {
		
		long stTime = System.currentTimeMillis();
		
		int tot = 0;
		for (int i = 0; i < 99999999; i++) {
			tot += i;
		}
		long edTime = System.currentTimeMillis();
		
		System.out.println(edTime-stTime);
	}
}
