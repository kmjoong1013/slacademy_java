package string_ex;

public class StringExam01 {

	public static void main(String[] args) {
		// String str = "Hello"; 
		// str�� charAt�� �̿��ؼ� ���� �ϳ� �ϳ��� ���Ͽ� ��ҹ��� ���θ� ����Ͻÿ�.
		
		String str = "Hello";
		
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch)==true) {
				System.out.println("�빮��");
			}else {
				System.out.println("�ҹ���");
			}
		}
		
		
	}
}
