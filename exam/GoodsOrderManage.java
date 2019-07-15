package exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GoodsOrderManage {
	List<Goods> goodsList;
	
	public GoodsOrderManage(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	
	public void goodsOrder() {
		Scanner in = new Scanner(System.in);
		System.out.print("주문할 상품코드 : ");
		String code = in.next(); // 상품코드
		
		Date d1 = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd");
		String d1Str = sf.format(d1);
		
		boolean a = false;
		
		for (int i = 0; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			
			
			if(code.equals(goods.code)) {
				a=true;
				System.out.println("일치하는 상품코드를 찾았습니다. 수량을 입력해주세요 : ");
				int qnt = in.nextInt();
				
				
				if (goods.qnt>=qnt && goods.qnt !=0) {
					goods.qnt = goods.qnt - qnt;
					System.out.println("주문에 성공하였습니다.");
					System.out.println("------------------------------------");
					System.out.println(d1Str+" 주문 확인서");
					System.out.println("상품코드 : "+goods.code);
					System.out.println("상품명 : "+goods.name);
					System.out.println("메이커 : "+goods.maker);
					System.out.println("가격 : "+goods.price);
					System.out.println("주문 수량 : "+qnt);
					System.out.println("총 금액 : "+(goods.price * qnt)+"원");
					System.out.println("------------------------------------");
					System.out.println("남은 수량 : "+goods.qnt);
					break;
				}else {
					System.out.println("재고를 초과하였습니다. 수량을 줄여주세요");
					break;
				}
				
			}else {
				continue;
			}
		}
		if(a==false) {
			System.out.println("일치하는 상품코드가 없습니다. 다시 입력해주세요.");
		}
	}
	

}
