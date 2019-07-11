package wrapper_ex;

public class Character01 {

	public static void main(String[] args) {
		Character ch = new Character('1');
		Character ch2 = new Character('A');
		
		if(Character.isDigit(ch)){
			System.out.println("¼ıÀÚ");
		}else {
			System.out.println("¼ıÀÚ ¾Æ´Ô");
		}
		if(Character.isAlphabetic(ch2)){
			System.out.println("¾ËÆÄºª");
		}else {
			System.out.println("¾ËÆÄºª ¾Æ´Ô");
		}
	}
}
