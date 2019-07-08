package class_syntax;

public class Cons01 {
	
	private String code; //상품코드
	private String name;//상품명
	private int price;//단가
	
	public Cons01() {
		System.out.println("Const01() 생성자 호출");
	}
	public Cons01(String code) {
		this.code=code;
		System.out.println("code:"+code);
	}
	public Cons01(String code, String name, int price ) {
		this.code=code;
		this.name=name;
		this.price=price;
		prn();
	}
	public void prn() {
		System.out.println("==================");
		System.out.println("상품코드:"+code);
		System.out.println("상품명:"+name);
		System.out.println("상품단가:"+price);
		
	}
}
