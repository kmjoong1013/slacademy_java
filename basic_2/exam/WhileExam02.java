package basic_syntax_ex.exam;

import java.util.Scanner;

public class WhileExam02 {
	public static void main(String[] args) {
		// while문 이용해서 반복 하고 a 가 -99 이면 종료 
		// a b c  세개의 값을 입력 받아 제일 큰 수를 출력하시오.
		
		int a,b,c,max;
		
		Scanner num = new Scanner(System.in);
		
		while (true) {
			System.out.print("첫번째 숫자 입력 : ");
			a = num.nextInt();
			System.out.print("두번째 숫자 입력 : ");
			b = num.nextInt();
			System.out.print("세번째 숫자 입력 : ");
			c = num.nextInt();
					
		}
	}
}
