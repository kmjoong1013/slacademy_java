package inheritance_ex;

public abstract class Abstract01_A {

	protected int price;
	
	public Abstract01_A(int price) {
		this.price = price;
	}
	
	public abstract void prn(); //�߻� �޼ҵ�
	
	public void info() {
		System.out.println("abstract super class");
	}
}
