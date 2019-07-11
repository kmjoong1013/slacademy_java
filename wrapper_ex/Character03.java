package wrapper_ex;

public class Character03 {

	public static void main(String[] args) {
		Character ch = new Character('\u0061');
		System.out.println("\\u0061 = " + ch.charValue());
		
		System.out.println("isDigit(\\u0061) : " + Character.isDigit('\u0061'));
		System.out.println("isDigit(\\u0030) : " + Character.isDigit('\u0030')); // '0'
		
		System.out.println("isDigit('a') : " + Character.isDigit('a'));
		System.out.println("isDigit('0') : " + Character.isDigit('0')); // '0'
	}
}
