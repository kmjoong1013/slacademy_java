package basic_syntax_ex.exam;

import java.util.Scanner;

public class If01Exam {
	
	public static void main(String[] args) {
		//num변수에 키보드로 int 값을 입력받아서 짝,홀수 여부 출력
		int num;
		
		Scanner ex = new Scanner(System.in);
		System.out.print("숫자 입력 : " );
		
		num = ex.nextInt();
		
		if (num==0) {
			System.out.println("0 입니다");
		}else if (num%2==0) {
			System.out.println("짝수입니다");
		}else if (num%2==1) {
			System.out.println("홀수입니다");
		}
	}
}
