package basic_syntax_ex.exam;

import java.util.Scanner;

public class ForExam3 {
	public static void main(String[] args) {
		// 키보드로 st 시작 값과 ed 종료 값을 입력 받아서
		// for문으로 st부터 ed 까지 순서대로 출력하고
		// st부터 ed까지 짝수의 합계도 출력하시오.
		
		int st,ed,even=0;
		
		Scanner si = new Scanner(System.in);
		System.out.print("시작 값 : ");
		st = si.nextInt();
		
		Scanner jong = new Scanner(System.in);
		System.out.print("종료 값 : ");
		ed = jong.nextInt();
		
		for (int i = st; i <= ed; i++) {
			System.out.print(" "+i);
		}
		
		for (int i = st; i <= ed; i++) {
			if (i%2==0) {
				even = even + i;
			}
		}
		System.out.println("짝수의 합계 : "+even);
	}
}
