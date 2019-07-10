package inheritance_ex;

//슈퍼클래스 또는 상위클래스
public class Inheritance03_A { 
	
	private int price; //가격

	//price의 값을 바꿀 수는 있다.
	public Inheritance03_A(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void prn() {
		System.out.println("A의 prn() 메소드=========");
		System.out.println("가격:"+price);
	}
}