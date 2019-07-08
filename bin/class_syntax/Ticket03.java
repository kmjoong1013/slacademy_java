package class_syntax;

import java.util.Scanner;

public class Ticket03 {

	private int personCnt;
	private int discountTime;
	private int amount;
	private int child;
	
	public Ticket03() {
		Scanner in = new Scanner(System.in);
		System.out.print("인원수 : ");
		personCnt = in.nextInt();
		System.out.print("아동수 : ");
		child = in.nextInt();
		System.out.print("조조 여부(1.조조 2.일반) : ");
		discountTime = in.nextInt();
		
		this.personCnt=personCnt;
		this.discountTime=discountTime;
		this.child=child;
		compute();
	}
	
	public void prn() {
		
		System.out.println("============================");
		System.out.println("인원수 : "+ personCnt);
		System.out.println("아동수 : "+child);
		System.out.println("조조 여부(1.조조 2.일반) : "+ discountTime);
		System.out.println("총금액 : "+amount);
	}
	
	public void compute() {
		if (discountTime==1) {
			amount = (personCnt * 6000)+(child * 5000);
		}else if (discountTime==2) {
			amount = (personCnt * 9000) + (child * 5000);
		}
	}
}
