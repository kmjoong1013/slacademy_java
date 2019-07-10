package map_ex;

public class Goods {
	public String code;
	public String name;
	public String maker;
	public int price;
	public int qnt; 
	
	public Goods(String code, String name, String maker, int price, int qnt ){
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.qnt = qnt;
	}
	
	public void prnInfo1(){
		System.out.println("코드:"+code + " 명칭:"+ name + " 메이커:"+maker);
	}
	public void prnInfo2(){
		System.out.println("가격:"+price+ " 수량:"+qnt);
	}
}
