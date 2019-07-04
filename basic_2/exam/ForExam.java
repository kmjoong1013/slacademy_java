package basic_syntax_ex.exam;

public class ForExam {
	public static void main(String[] args) {
		// 1~10까지 정수의 합계를 for문을 이용해서 출력하시오
		
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result = result+i;
			
			if (i==10) {
				System.out.println("1-10까지의 합계 : "+ result);
			}
		}
	}
}
