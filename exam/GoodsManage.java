package exam;

import java.util.List;
import java.util.Scanner;

public class GoodsManage {

	List<Goods> goodsList;
	
	public GoodsManage(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	
	public void goodsAdd() {
		Scanner in = new Scanner(System.in);
		System.out.print("상품코드:");
		String code = in.next(); // 상품코드
		System.out.print("상품명:");
		String name = in.next(); // 상품명 
		System.out.print("메이커:");
		String maker = in.next(); // 상품명 
		System.out.print("가격:");
		int price = in.nextInt(); // 상품명 
		System.out.print("수량:");
		int qnt = in.nextInt(); // 상품명 
		
		Goods goods = new Goods (code, name, maker, price, qnt);
		goodsList.add(goods);
	}
	
	public void goodsPrnAll() {
		for(int i = 0; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			
			System.out.println("------------------------------------");
			System.out.println("code : "+goods.code);
			System.out.println("name : "+goods.name);
			System.out.println("maker : "+goods.maker);
			System.out.println("price : "+goods.price);
			System.out.println("qnt : "+goods.qnt);
		}
	}
	
	public void goodsRemove() {
		Scanner in = new Scanner(System.in);
		System.out.print("삭제할 상품코드 : ");
		String code = in.next(); // 상품코드
		
		for(int i = 0 ; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			
			if(code.equals(goods.code)) {
				goodsList.remove(i);
				break;
			}
		}
	}
	
	public void loop() {
		// 1:상품추가 2:상품삭제 3:정보출력 0:종료  
		Scanner in = new Scanner(System.in);
		int menuNum = 0;
		while(true) {
			System.out.println("------------------------------------");
			System.out.print("1:상품추가 2:상품삭제 3:정보출력 0:상위메뉴");
			menuNum = in.nextInt();
			switch(menuNum) {
			case 0:
				return;
			case 1:
				goodsAdd();
				break;
			case 2:
				goodsRemove();
				break;
			case 3:
				goodsPrnAll();
				break;
			}
		}
	}
}
