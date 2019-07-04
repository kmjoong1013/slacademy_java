package basic_syntax_ex.exam;

import java.util.Scanner;

public class If03Exam {
	public static void main(String[] args) {
		// 인원수를 입력 받고 시간을 
		// 입력 받아 금액을 계산해서 출력하시오.
		// 시간(1:조조 2:일반) 
		// 티켓 1개당 가격 조조:6000 일반9000
		
		int mem,time;
		
		Scanner in = new Scanner(System.in);
		System.out.print("인원 입력 : ");
		mem = in.nextInt();
		
		Scanner si = new Scanner(System.in);
		System.out.print("시간 입력 (1:조조 2:일반) : ");
		time = si.nextInt();
		
		if (time==1) {
			System.out.println("총 가격은 " + mem*6000 +"입니다");
		}else if (time==2) {
			System.out.println("총 가격은 " + mem*9000 +"입니다");
		}else {
			System.out.println("시간은 1,2 중 하나로 입력해주세요");
		}
	}
}
