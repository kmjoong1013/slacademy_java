package exception_ex;

import java.util.Scanner;

public class ExceptionExam01_2 {

	public void compute() throws NumberFormatException{
		Scanner in = new Scanner(System.in);
		
		System.out.print("두개 숫자 입력 : " );
		String a = in.next();
		String b = in.next();
		
		int inta = Integer.parseInt(a);
		int intb = Integer.parseInt(b);
		
		System.out.println("합계 : "+(inta+intb));
			
		
	}
	
	public static void main(String[] args) {
		ExceptionExam01 obj = new ExceptionExam01();
		try {
			obj.compute();
		} catch (NumberFormatException e) {
			System.out.println("문자는 숫자로 변환이 안됨니다.");
		}
		
	}
}
