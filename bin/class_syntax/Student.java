package class_syntax;

import java.util.Scanner;

public class Student {
	private char korGrade;
	private char engGrade;
	private int korScore;
	private int engScore;
	
	
	public void setScore() {
		//Ű����� ����,���� ���� �Է�
		Scanner in = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		korScore = in.nextInt();
		System.out.print("���� ���� �Է� : ");
		engScore = in.nextInt();
	}
	public void prn() {
		//computeGrade(score)�� Ȱ���ؼ� korGrade,engGrade�� ��������
		//����,���� ���� ����,���
		//����,���� ���� ���
		
		korGrade = computeGrade(korScore);
		engGrade = computeGrade(engScore);
		System.out.println("���� : " + (korScore+engScore));
		System.out.println("��� : " + ((korScore+engScore)/2));
		System.out.println("���� ���� : " + korGrade);
		System.out.println("���� ���� : " + engGrade);
	}
	
	public char computeGrade(int score) {
		//Method03�� �ִ� �޼ҵ�� �ϼ�
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
