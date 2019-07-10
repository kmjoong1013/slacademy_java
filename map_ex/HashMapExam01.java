package map_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import list_ex.Goods;

public class HashMapExam01 {

	public Map goodsMap = new HashMap();
	
	public void goodsAdd() {
		//goods 객체를 생성해서 상품 코드를 key값 value는 Goods를 해서 put
		//Goods goods = new Goods("A-100","상품명","메이커",1,1);
		//goodsMap.put("A-100",goods);
		//goodsMap.put("B-100",goods);
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
		
		goodsMap.put(code,goods);
	}
	public void goodsPrnAll() {
		Set mapKeys = goodsMap.keySet();
		System.out.println("--------------------------------");
		Iterator it = mapKeys.iterator();
		while(it.hasNext()) {
			String code = (String)it.next();
			Goods goods = (Goods)goodsMap.get(code);
			System.out.println("code:"+goods.code);
			System.out.println("name:"+goods.name);
			System.out.print("maker:"+goods.maker);
			System.out.print(" price:"+goods.price);
			System.out.println(" qnt:"+goods.qnt);
		}
	}
	
	public void goodsRemove() {
		// 키보드로 상품 코드를 입력 받고 해당하는 상품코드가 있으면(constraintKey) 상품 정보 출력
		// 없으면 해당 상품 정보가 없다고 출력하시오.
		Scanner in = new Scanner(System.in);
		System.out.print("상품코드");
		String code = in.next();//상품코드
		if (goodsMap.containsKey(code)) {
			goodsMap.remove(code);
		}else {
			System.out.println("해당상품 없음");
		}
		
	}
	public void loop() {
		// 1:상품추가 2:상품삭제 3:정보출력 0:종료  
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
		HashMapExam01 obj = new HashMapExam01();
		obj.loop();
	}
}
