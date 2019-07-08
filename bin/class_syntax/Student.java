package class_syntax;

import java.util.Scanner;

public class Student {
	private char korGrade;
	private char engGrade;
	private int korScore;
	private int engScore;
	
	
	public void setScore() {
		//키보드로 국어,영어 점수 입력
		Scanner in = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		korScore = in.nextInt();
		System.out.print("영어 점수 입력 : ");
		engScore = in.nextInt();
	}
	public void prn() {
		//computeGrade(score)를 활용해서 korGrade,engGrade에 학점저장
		//국어,영어 점수 총점,평균
		//국어,영어 학점 출력
		
		korGrade = computeGrade(korScore);
		engGrade = computeGrade(engScore);
		System.out.println("총점 : " + (korScore+engScore));
		System.out.println("평균 : " + ((korScore+engScore)/2));
		System.out.println("국어 학점 : " + korGrade);
		System.out.println("영어 학점 : " + engGrade);
	}
	
	public char computeGrade(int score) {
		//Method03에 있는 메소드로 완성
		char grade = '0';
		if (score >=90) {
			grade = 'A';
		}else if (score >=80) {
			grade = 'B';
		}else if (score >=70) {
			grade = 'C';
		}else if (score >=60) {
			grade = 'D';
		}else  {
			grade = 'F';
		}
		
		return grade;
	}
}
