package class_syntax;

import java.util.Scanner;

public class Ticket {
	public int mem;//�ο���
	public int jojo;//��������
	public int amount;//�ݾ�
	
	
	public void ticket() {
		Scanner in = new Scanner(System.in);
		System.out.print("�ο� �Է� : ");
		mem = in.nextInt();
		System.out.print("���� ����(1.���� 2.�Ϲ�) : ");
		jojo = in.nextInt();
		//in.close();
		compute();
	}
	
	public void ticket(int a) {
		Scanner in = new Scanner(System.in);
		mem = a;
		System.out.print("���� ����(1.���� 2.�Ϲ�) : ");
		jojo = in.nextInt();
		in.close();
		compute();
	}
	
	public void ticket(int a, int b) {
		 mem = a;
		 jojo = b;
		 compute();
	}
	
	public void prn() {
		System.out.println("============================");
		System.out.println("�ο��� : "+mem);
		System.out.println("���� ����(1.���� 2.�Ϲ�) : "+jojo);
		System.out.println("�ѱݾ� : "+amount);
	}
	
	public void compute() {
		if (jojo==1) {
			amount = mem * 6000;
		}else if (jojo==2) {
			amount = mem * 9000;
		}
	}

	public static void main(String[] args) {
		
	}
}
