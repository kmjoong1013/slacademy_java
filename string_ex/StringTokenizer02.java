package string_ex;

import java.util.StringTokenizer;

public class StringTokenizer02 {

	public static void main(String[] args) {
		String data = "이순신;100;강감찬;98";
		
		StringTokenizer st = new StringTokenizer(data, ";", true);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
