package class_syntax;

import java.util.Scanner;

public class Ticket03 {

	private int personCnt;
	private int discountTime;
	private int amount;
	private int child;
	
	public Ticket03() {
		Scanner in = new Scanner(System.in);
		System.out.print("�ο��� : ");
		personCnt = in.nextInt();
		System.out.print("�Ƶ��� : ");
		child = in.nextInt();
		System.out.print("���� ����(1.���� 2.�Ϲ�) : ");
		discountTime = in.nextInt();
		
		this.personCnt=personCnt;
		this.discountTime=discountTime;
		this.child=child;
		compute();
	}
	
	public void prn() {
		
		System.out.println("============================");
		System.out.println("�ο��� : "+ personCnt);
		System.out.println("�Ƶ��� : "+child);
		System.out.println("���� ����(1.���� 2.�Ϲ�) : "+ discountTime);
		System.out.println("�ѱݾ� : "+amount);
	}
	
	public void compute() {
		if (discountTime==1) {
			amount = (personCnt * 6000)+(child * 5000);
		}else if (discountTime==2) {
			amount = (personCnt * 9000) + (child * 5000);
		}
	}
}
