package inheritance_ex;

//����Ŭ���� �Ǵ� ����Ŭ����
public class Inheritance03_A { 
	
	private int price; //����

	//price�� ���� �ٲ� ���� �ִ�.
	public Inheritance03_A(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void prn() {
		System.out.println("A�� prn() �޼ҵ�=========");
		System.out.println("����:"+price);
	}
}