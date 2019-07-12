package string_ex;

public class String07 {

	public static void main(String[] args) {
		String msg = "ȫ�浿!!!!! ";
		
		System.out.println("msg.length():"+ msg.length());
		msg = msg.trim();
		System.out.println("msg.length():"+ msg.length());
		System.out.println(msg);
		
		String msg2 = "    ȫ�浿!!       ";
		msg2 = msg2.replace(" ", "*");
		System.out.println(msg2);
		
		String msg3 = String.valueOf(1);
	}
}
