package inheritance_ex;

public class Inheritance02_A {

	private int price; //����
	
	//price�� ���� �ٲ� ���� �ִ�.
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int  getPrice() {
		return this.price;
	}
	
	public void prn() {
		System.out.println("A�� prn() �޼ҵ� ======");
		System.out.println("���� " + price);
	}
}
