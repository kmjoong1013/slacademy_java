package inheritance_ex;

//슈퍼클래스 또는 상위클래스
public class Inheritance01_A { 
	
	private int price; //가격
	
	//price의 값을 바꿀 수는 있다.
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int  getPrice() {
		return this.price;
	}

}
