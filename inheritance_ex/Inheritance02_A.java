package inheritance_ex;

public class Inheritance02_A {

	private int price; //가격
	
	//price의 값을 바꿀 수는 있다.
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int  getPrice() {
		return this.price;
	}
	
	public void prn() {
		System.out.println("A의 prn() 메소드 ======");
		System.out.println("가격 " + price);
	}
}
