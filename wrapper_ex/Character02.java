package wrapper_ex;

public class Character02 {

	public static void main(String[] args) {
		Character ch = new Character('A');
		Character ch2 = new Character('a');
		
		if(Character.isUpperCase(ch)){
			System.out.println("�빮��");
		}else {
			System.out.println("�ҹ���");
		}
		char ch3 = Character.toUpperCase(ch2);
		System.out.println("ch2 = " + ch3);
	}
}
