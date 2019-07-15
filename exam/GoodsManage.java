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
		System.out.print("��ǰ�ڵ�:");
		String code = in.next(); // ��ǰ�ڵ�
		System.out.print("��ǰ��:");
		String name = in.next(); // ��ǰ�� 
		System.out.print("����Ŀ:");
		String maker = in.next(); // ��ǰ�� 
		System.out.print("����:");
		int price = in.nextInt(); // ��ǰ�� 
		System.out.print("����:");
		int qnt = in.nextInt(); // ��ǰ�� 
		
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
		System.out.print("������ ��ǰ�ڵ� : ");
		String code = in.next(); // ��ǰ�ڵ�
		
		for(int i = 0 ; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			
			if(code.equals(goods.code)) {
				goodsList.remove(i);
				break;
			}
		}
	}
	
	public void loop() {
		// 1:��ǰ�߰� 2:��ǰ���� 3:������� 0:����  
		Scanner in = new Scanner(System.in);
		int menuNum = 0;
		while(true) {
			System.out.println("------------------------------------");
			System.out.print("1:��ǰ�߰� 2:��ǰ���� 3:������� 0:�����޴�");
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
