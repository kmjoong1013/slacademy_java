package basic_syntax_ex.exam;

import java.util.Scanner;

public class If02Exam {
	public static void main(String[] args) {
		// score 변수에 키보드로 int 값을 입력 받아서 학점을 출력하시오
		 // A(100~90) B(89~80) C(79~70) D(69~60) F(59~0)
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 입력 : ");
		
		score = sc.nextInt();
		
		if (score>=90) {
			System.out.println("A입니다.");
		}else if (score>=80) {
			System.out.println("B입니다.");
		}else if (score>=70) {
			System.out.println("C입니다.");
		}else if (score>=60) {
			System.out.println("D입니다.");
		}else if (score<60) {
			System.out.println("F입니다.");
		}
	}
}
