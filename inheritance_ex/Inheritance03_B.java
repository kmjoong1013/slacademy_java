package inheritance_ex;

public class Inheritance03_B extends Inheritance03_A{

	private int quantity;
	
	public Inheritance03_B(int price, int quantity) {
		super(price);
		this.quantity = quantity;
	}
	
	public void prn() {
		System.out.println("B의 prn() 메소드=========");
		System.out.println("가격*수량:"+(getPrice()*quantity));
	}
	
	public static void main(String[] args) {
		Inheritance03_B obj = new Inheritance03_B(10000, 3);
	}
}
