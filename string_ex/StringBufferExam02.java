package string_ex;

public class StringBufferExam02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("100000000");
		
		sb.insert(sb.length()-3,",");
		System.out.println(sb);
		
		sb.insert(sb.length()-3*2-1,",");
		System.out.println(sb);
	}
}
