package inheritance_ex;

public class Inheritance02_B extends Inheritance02_A {

	private int quantity;
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void prn() {
		setPrice(1000);
		System.out.println("B�� prn() �޼ҵ� =======");
		System.out.println("���� * ����  " +(getPrice()*quantity));	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance02_B obj = new Inheritance02_B();
		obj.setQuantity(3);
		obj.prn();
	}

}
