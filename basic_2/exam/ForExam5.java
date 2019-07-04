package basic_syntax_ex.exam;

import java.util.Scanner;

public class ForExam5 {
	public static void main(String[] args) {
		// 단일 for문을 9번 반복하면 구구단을 출력할수 있다.
		// 키보드로 단을 입력 받아 해당 단을 출력하시오
		// 예)   3x1=3
		//      3x2=6
		//      ...
		
		int dan;
		
		Scanner gugu = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		dan = gugu.nextInt();
		
		for (int i = 1; i <= 9 ; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}
