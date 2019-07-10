package list_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExam01 {
	
	public List goodsList = new ArrayList();
	
	public void goodsAdd() {
		Scanner in = new Scanner(System.in);
		System.out.print("��ǰ�ڵ�");
		String code = in.next();//��ǰ�ڵ�
		System.out.print("��ǰ��");
		String name = in.next();//��ǰ��
		System.out.print("����Ŀ");
		String maker = in.next();//��ǰ��
		System.out.print("����");
		int price = in.nextInt();//��ǰ��
		System.out.print("����");
		int qnt = in.nextInt();//��ǰ��
		
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
		System.out.print("��ǰ�ڵ�");
		String code = in.next();//��ǰ�ڵ�
		
		for (int i = 0; i < goodsList.size(); i++) {
			Goods goods = (Goods)goodsList.get(i);
			if (code.equals(goods.code)) {
				goodsList.remove(goods);
			}else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}
	
	public void loop() {
		Scanner in = new Scanner(System.in);
		int menuNum = 0;
		while(true) {
			System.out.print("1.��ǰ�߰� 2.��ǰ���� 3.������� 0.����");
			menuNum = in.nextInt();
			switch(menuNum) {
			case 0 :
				System.exit(0);
				break;
			case 1 :
				System.out.println("ArrayList�� Ű����� Goods ������ �߰��ϴ� ������ �ϼ��Ͻÿ�.");
				//Goods������ �߰��ϴ� �޼ҵ带 ����� ȣ��
				goodsAdd();
				break;
			case 2 :
				System.out.println("ArrayList�� Ű����� Goods ������ �����ϴ� ������ �ϼ��Ͻÿ�.");
				//Ű����� ��ǰ�ڵ带 �Է¹ް� for������ ArrayList���� Goods������ get�Ͽ� goods��
				//code�� Ű����� �Է¹��� ���� if���� equals�� �̿��ؼ� ���ؼ� ������� remove(i)
				//Goods ������ �����ϴ� �޼ҵ带 ����� ȣ��
				goodsRemove();
				break;
			case 3 :
				System.out.println("ArrayList�� Ű����� Goods ���� ��ü�� ����ϴ� ������ �ϼ��Ͻÿ�.");
				//Goods ���� ��ü�� ����ϴ� �޼ҵ带 ����� ȣ��
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
