package string_ex;

public class String02 {

	public static void main(String[] args) {
		String msg = "������20190712"; //�ε����� ù���ں���0
		
		char ch = msg.charAt(4);
		if (Character.isDigit(ch)) {
			System.out.println("index 4���� �ִ� ����(char)�� ���ڴ�");
		}
		else {
			System.out.println("index 4���� �ִ� ����(char)�� ���ڰ� �ƴϴ�");
		}
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(i+":"+msg.charAt(i));
		}
		//String (char char[])
		char chArr1[] = {'H','e','l','l','o'};
		String str1 = new String(chArr1);
		System.out.println(str1);
		//String (char char[],int startIndex,int nchar)
		char chArr2[] = {'@','#','J','a','v','a','%','*'};
		String str2 = new String(chArr2,2,4);
		System.out.println(str2);
	}
}
