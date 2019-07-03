package basic_syntax_ex;

public class Printf01 {
	public static void main(String [] args) {
		//String name = "홍길동";
		//int kor = 80, eng = 85;
		// printf를 활용해서 '홍길동 총점 : ooo 평균 : ooo' 을 출력
		// 소수점 이하도 출력 
		
		String name = "홍길동";
		int kor = 80;
		int eng = 81;
		
		int tot = kor + eng;
		double avg = (int)((tot / 2.0) + 0.5) ; // 뒤에 소수점 붙히면 더블형으로 됨
		
		System.out.printf("%s님 총점: %d 평균:%f\n", name, tot, avg);
	}
}
