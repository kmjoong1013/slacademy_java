package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public List<Goods> goodsList = new ArrayList<Goods>();
	
	Scanner in = new Scanner(System.in);
	
	public int goodsMainloop() {
		int menuNum = 0;
		
		GoodsManage goodsManage = new GoodsManage(goodsList);
		GoodsOrderManage goodsOrderManage = new GoodsOrderManage(goodsList);
		
		 while(true) {
			 System.out.println("===============================");
			 System.out.println("1:惑前包府 2:惑前林巩  0:辆丰 ");
			 menuNum = in.nextInt();
			 switch(menuNum) {
			 case 1 :
				 goodsManage.loop();
				 break;
			 case 2:
				 goodsOrderManage.goodsOrder();  
				 break;
			 case 0 :
				 System.exit(0);
			 }
		 }
	}
}
