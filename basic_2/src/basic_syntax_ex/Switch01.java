package basic_syntax_ex;

public class Switch01 {
	public static void main(String[] args) {
		int num=2;
		
		switch (num) {
		case 1:
			System.out.println("1번 선택");
			break;
		case 2:
			System.out.println("2번 선택");
			break;
		case 3:
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("존재하지 않는 case");
			break;
		}
	}
}
