package inheritance_ex;

public class Inheritance03_B extends Inheritance03_A{

	private int quantity;
	
	public Inheritance03_B(int price, int quantity) {
		super(price);
		this.quantity = quantity;
	}
	
	public void prn() {
		System.out.println("B�� prn() �޼ҵ�=========");
		System.out.println("����*����:"+(getPrice()*quantity));
	}
	
	public static void main(String[] args) {
		Inheritance03_B obj = new Inheritance03_B(10000, 3);
	}
}
