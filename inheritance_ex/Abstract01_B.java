package inheritance_ex;

public class Abstract01_B extends Abstract01_A {
	
	private int quantity;
	
	public Abstract01_B(int price, int quantity) {
		super(price);
		this.quantity=quantity;
	}

	@Override //����Ŭ������ �Ȱ����� ������ ������ prn�������� ����
	public void prn() {
		System.out.println("price*quantitiy : "+price*quantity);
		Abstract01_B obj = new Abstract01_B(1000,3);
		obj.prn();
		
		//Abstract01_A obj = new Abstract01_A(1000);     �߻�޼ҵ�� �����ȵ�
	}

	public static void main(String[] args) {
		
	}
}
