package class_syntax;

public class Ticket02 {

	private int personCnt;
	private int discountTime;
	private int amount;
	
	public Ticket02(int personCnt, int discountTime) {
		this.personCnt=personCnt;
		this.discountTime=discountTime;
		compute();
	}

	void prn() {
		System.out.println("============================");
		System.out.println("�ο��� : "+ personCnt);
		System.out.println("���� ����(1.���� 2.�Ϲ�) : "+ discountTime);
		System.out.println("�ѱݾ� : "+amount);
	}
	
	public void compute() {
		if (discountTime==1) {
			amount = personCnt * 6000;
		}else if (discountTime==2) {
			amount = personCnt * 9000;
		}
	}

}
