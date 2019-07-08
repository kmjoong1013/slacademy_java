package class_syntax;

public class Student02 {
	private char korGrade;
	private char engGrade;
	private int korScore;
	private int engScore;
	private String name;
	
	public Student02(String name, int korScore, int engScore) {
		this.name=name;;
		this.korScore=korScore;
		this.engScore=engScore;
		
	}

	public void prn() {
		korGrade = computeGrade(korScore);
		engGrade = computeGrade(engScore);
		System.out.println("이름 : " + (name));
		System.out.println("총점 : " + (korScore+engScore));
		System.out.println("평균 : " + ((korScore+engScore)/2));
		System.out.println("국어 학점 : " + korGrade);
		System.out.println("영어 학점 : " + engGrade);
	}

	private char computeGrade(int score) {
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


