package exception_ex;

import java.util.Scanner;

public class ExceptionExam01 {
	// compute �޼ҵ忡�� a b �ΰ��� ���ڿ��� �Է� �޾�  Integer.parseInt()�� 
	// �̿��ؼ� ���ڷ� ������ �� �հ踦 ����Ͻÿ�
	// NumberFormatExcetion�� ���� ó���� ���ּ��� 
	
	public void compute() throws NumberFormatException{
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ΰ� ���� �Է� : " );
		String a = in.next();
		String b = in.next();
		
		//int inta = Integer.parseInt(a);
		//int intb = Integer.parseInt(b);
		
		try {
			int inta = Integer.parseInt(a);
			int intb = Integer.parseInt(b);
			
			System.out.println("�հ� : "+(inta+intb));
			
		} catch (NumberFormatException e) {
			System.out.println("���ڴ� ���ڷ� ��ȯ�� �ȵʴϴ�.");
		}
		
		//System.out.println("�հ� : "+(inta+intb));
	}
	
	public static void main(String[] args) {
		ExceptionExam01 obj = new ExceptionExam01();
		obj.compute();
	}
}
