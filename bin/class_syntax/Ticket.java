package class_syntax;

import java.util.Scanner;

public class Ticket {
	public int mem;//인원수
	public int jojo;//조조여부
	public int amount;//금액
	
	
	public void ticket() {
		Scanner in = new Scanner(System.in);
		System.out.print("인원 입력 : ");
		mem = in.nextInt();
		System.out.print("조조 여부(1.조조 2.일반) : ");
		jojo = in.nextInt();
		//in.close();
		compute();
	}
	
	public void ticket(int a) {
		Scanner in = new Scanner(System.in);
		mem = a;
		System.out.print("조조 여부(1.조조 2.일반) : ");
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
		System.out.println("인원수 : "+mem);
		System.out.println("조조 여부(1.조조 2.일반) : "+jojo);
		System.out.println("총금액 : "+amount);
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
