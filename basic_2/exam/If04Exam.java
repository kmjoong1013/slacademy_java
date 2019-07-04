package basic_syntax_ex.exam;

import java.util.Scanner;

public class If04Exam {
	public static void main(String[] args) {
		// a b 두 정수를 입력 받고 
		// 연산자(1:+ 2:- 3:* 4:/) 까지 입력 을 받아 결과를 출력하시오
		// 예)   a = 10
		//       b = 20
		//       1
		//       a + b = 30
		
		int a,b,z;
		
		Scanner num = new Scanner(System.in);
		System.out.print("a = ");
		a = num.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.print("b = ");
		b = num2.nextInt();
		
		Scanner sem = new Scanner(System.in);
		System.out.print("연산자(1:+ 2:- 3:* 4:/)를 선택해주세요 : ");
		z = sem.nextInt();
		
		if (z==1) {
			System.out.println("a + b : "+(a+b)+"입니다");
		}else if (z==2) {
			System.out.println("a - b : "+(a-b)+"입니다");
		}else if (z==3) {
			System.out.println("a x b : "+(a*b)+"입니다");
		}else if (z==4) {
			System.out.println("a / b : "+(a/b)+"입니다");
		}
	}
}
