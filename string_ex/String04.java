package string_ex;

public class String04 {

	public static void main(String[] args) {
		String msg = "������ �ְ��� 100p�Դϴ�.";
		char dst[] = new char[50];
		msg.getChars(8, 12, dst, 3);
		
		System.out.println(dst[3]+":"+dst[4]+":"+dst[5]+":"+dst[6]);
	}
}
