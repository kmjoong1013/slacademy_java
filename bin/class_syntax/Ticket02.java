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
		System.out.println("인원수 : "+ personCnt);
		System.out.println("조조 여부(1.조조 2.일반) : "+ discountTime);
		System.out.println("총금액 : "+amount);
	}
	
	public void compute() {
		if (discountTime==1) {
			amount = personCnt * 6000;
		}else if (discountTime==2) {
			amount = personCnt * 9000;
		}
	}

}
