package list_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExam01 {
	
	public List goodsList = new ArrayList();
	
	public void goodsAdd() {
		Scanner in = new Scanner(System.in);
		System.out.print("상품코드");
		String code = in.next();//상품코드
		System.out.print("상품명");
		String name = in.next();//상품명
		System.out.print("메이커");
		String maker = in.next();//상품명
		System.out.print("가격");
		int price = in.nextInt();//상품명
		System.out.print("갯수");
		int qnt = in.nextInt();//상품명
		
		Goods goods = new Goods(code, name, maker , price, qnt);
		
		goodsList.add(goods);
		
	}
	public void goodsPrnAll() {
		for (int i = 0; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			System.out.println("--------------------");
			System.out.print("code:"+goods.code);
			System.out.println(" name:"+goods.name);
			System.out.print("maker:"+goods.maker);
			System.out.print(" price:"+goods.price);
			System.out.println(" qnt:"+goods.qnt);
		}
			
		}
	public void goodsRemove() {
		Scanner in = new Scanner(System.in);
		System.out.print("상품코드");
		String code = in.next();//상품코드
		
		for (int i = 0; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			if (code.equals(goods.code)) {
				goodsList.remove(goods);
			}else {
				System.out.println("다시 입력하세요");
			}
		}
	}
	
	public void loop() {
		Scanner in = new Scanner(System.in);
		int menuNum = 0;
		while(true) {
			System.out.print("1.상품추가 2.상품삭제 3.정보출력 0.종료");
			menuNum = in.nextInt();
			switch(menuNum) {
			case 0 :
				System.exit(0);
				break;
			case 1 :
				System.out.println("ArrayList에 키보드로 Goods 정보를 추가하는 내용을 완성하시오.");
				//Goods정보를 추가하는 메소드를 만들고 호출
				goodsAdd();
				break;
			case 2 :
				System.out.println("ArrayList에 키보드로 Goods 정보를 삭제하는 내용을 완성하시오.");
				//키보드로 상품코드를 입력받고 for문으로 ArrayList에서 Goods정보를 get하여 goods의
				//code와 키보드로 입력받은 값을 if문과 equals를 이용해서 비교해서 같을경우 remove(i)
				//Goods 정보를 삭제하는 메소드를 만들고 호출
				goodsRemove();
				break;
			case 3 :
				System.out.println("ArrayList에 키보드로 Goods 정보 전체를 출력하는 내용을 완성하시오.");
				//Goods 정보 전체를 출력하는 메소드를 만들고 호출
				goodsPrnAll();
				break;
			}
		}
	}

	public static void main(String[] args) {
		ArrayListExam01 obj = new ArrayListExam01();
		obj.loop();
	}
}
