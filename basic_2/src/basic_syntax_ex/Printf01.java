package basic_syntax_ex;

public class Printf01 {
	public static void main(String [] args) {
		//String name = "홍길동";
		//int kor = 80, eng = 85;
		// printf를 활용해서 '홍길동 총점 : ooo 평균 : ooo' 을 출력
		// 소수점 이하도 출력 
		
		String name = "홍길동";
		double kor = 80.05;
		double eng = 85.99;
		
		double tot = kor + eng;
		double avg = tot / 2;
		
		System.out.printf("%s님 총점: %.1f 평균:%.2f\n", name, tot, avg);
	}
}
