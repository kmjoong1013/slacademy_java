package wrapper_ex;

public class Character01 {

	public static void main(String[] args) {
		Character ch = new Character('1');
		Character ch2 = new Character('A');
		
		if(Character.isDigit(ch)){
			System.out.println("����");
		}else {
			System.out.println("���� �ƴ�");
		}
		if(Character.isAlphabetic(ch2)){
			System.out.println("���ĺ�");
		}else {
			System.out.println("���ĺ� �ƴ�");
		}
	}
}
