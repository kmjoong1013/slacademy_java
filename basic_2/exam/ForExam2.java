package basic_syntax_ex.exam;

public class ForExam2 {
	public static void main(String[] args) {
		// for문을 이용해서 1~10까지의 숫자 중 홀수의 합계를 구하시오
		// #1 for문과 if문만 사용
		// #2 for문과 if문 continue 사용
		
		int result = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i%2==1) {
				result = result+i;
			}
				
			}
			System.out.println("홀수의 합계 : "+ result);
			
			
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				continue;
			}
			result = result+i;
			}
		System.out.println("홀수의 합계 : "+ result);
	}
}
		
	



