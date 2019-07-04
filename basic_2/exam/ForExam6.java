package basic_syntax_ex.exam;

import java.util.Scanner;

public class ForExam6 {
	public static void main(String[] args) {
		// 이중 for문을 이용하면 구구단을 원하는 범위에 단을 출력할 수 있다.
		// 키보드로 시작 단과 종료 단을 입력 받아 해당 단을 출력하시오
		// 예)   st=3
		//      ed=5
		//   3단부터 5단까지 출력 
		
		int st,ed = 0;
		
		Scanner dan = new Scanner(System.in);
		System.out.print("시작단 입력 : ");
		st = dan.nextInt();
		
		Scanner dan2 = new Scanner(System.in);
		System.out.print("종료단 입력 : ");
		ed = dan2.nextInt();
		
		for (int i = st; i <= ed; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		
		}
	}
}
