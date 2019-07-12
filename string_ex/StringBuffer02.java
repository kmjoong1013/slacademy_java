package string_ex;

public class StringBuffer02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Kim!@## hello");
		sb.delete(3,7); // 
		System.out.println(sb);
		sb.setCharAt(3,'H');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
