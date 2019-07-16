package exception_ex;

import java.util.Scanner;

public class ExceptionExam01 {
	// compute 메소드에서 a b 두개의 문자열을 입력 받아  Integer.parseInt()를 
	// 이용해서 숫자로 변경한 후 합계를 출력하시오
	// NumberFormatExcetion에 대한 처리를 해주세요 
	
	public void compute() throws NumberFormatException{
		Scanner in = new Scanner(System.in);
		
		System.out.print("두개 숫자 입력 : " );
		String a = in.next();
		String b = in.next();
		
		//int inta = Integer.parseInt(a);
		//int intb = Integer.parseInt(b);
		
		try {
			int inta = Integer.parseInt(a);
			int intb = Integer.parseInt(b);
			
			System.out.println("합계 : "+(inta+intb));
			
		} catch (NumberFormatException e) {
			System.out.println("문자는 숫자로 변환이 안됨니다.");
		}
		
		//System.out.println("합계 : "+(inta+intb));
	}
	
	public static void main(String[] args) {
		ExceptionExam01 obj = new ExceptionExam01();
		obj.compute();
	}
}
