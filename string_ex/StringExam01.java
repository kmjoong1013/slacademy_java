package string_ex;

public class StringExam01 {

	public static void main(String[] args) {
		// String str = "Hello"; 
		// str을 charAt을 이용해서 글자 하나 하나에 대하여 대소문자 여부를 출력하시오.
		
		String str = "Hello";
		
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch)==true) {
				System.out.println("대문자");
			}else {
				System.out.println("소문자");
			}
		}
		
		
	}
}
