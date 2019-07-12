package string_ex;

public class StringBuffer01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("kim");
		System.out.println("초기  글자 크기 : " + sb.length()); // 문자열 길이
		System.out.println("초기 버퍼 크기 :" + sb.capacity()); // 버퍼 사이즈
		sb.append("hello");
		sb.insert(3,"~~~");
		System.out.println(sb);
		System.out.println("글자 크기 : " + sb.length()); // 문자열 길이
		System.out.println("버퍼 크기 :" + sb.capacity()); // 버퍼 사이즈 
	}
}
