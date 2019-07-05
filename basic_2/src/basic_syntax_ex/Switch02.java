package basic_syntax_ex;

public class Switch02 {
	public static void main(String[] args) {
		char ch = 's';
		switch (ch) {
		
		case 'S':
		case 's':
			System.out.println("데이터 저장");
			break;
		case 'd':
			System.out.println("데이터 저장");
			break;
		case 'i':
			System.out.println("데이터 저장");
			break;
		default:
			System.out.println("다시 입력하세요");
			break;
		}
	}
}
