package exception_ex;

import java.util.Scanner;

public class ExceptionExam01_2 {

	public void compute() throws NumberFormatException{
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ΰ� ���� �Է� : " );
		String a = in.next();
		String b = in.next();
		
		int inta = Integer.parseInt(a);
		int intb = Integer.parseInt(b);
		
		System.out.println("�հ� : "+(inta+intb));
			
		
	}
	
	public static void main(String[] args) {
		ExceptionExam01 obj = new ExceptionExam01();
		try {
			obj.compute();
		} catch (NumberFormatException e) {
			System.out.println("���ڴ� ���ڷ� ��ȯ�� �ȵʴϴ�.");
		}
		
	}
}
