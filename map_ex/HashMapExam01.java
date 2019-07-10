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
		//goods ��ü�� �����ؼ� ��ǰ �ڵ带 key�� value�� Goods�� �ؼ� put
		//Goods goods = new Goods("A-100","��ǰ��","����Ŀ",1,1);
		//goodsMap.put("A-100",goods);
		//goodsMap.put("B-100",goods);
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
		// Ű����� ��ǰ �ڵ带 �Է� �ް� �ش��ϴ� ��ǰ�ڵ尡 ������(constraintKey) ��ǰ ���� ���
		// ������ �ش� ��ǰ ������ ���ٰ� ����Ͻÿ�.
		Scanner in = new Scanner(System.in);
		System.out.print("��ǰ�ڵ�");
		String code = in.next();//��ǰ�ڵ�
		if (goodsMap.containsKey(code)) {
			goodsMap.remove(code);
		}else {
			System.out.println("�ش��ǰ ����");
		}
		
	}
	public void loop() {
		// 1:��ǰ�߰� 2:��ǰ���� 3:������� 0:����  
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
		HashMapExam01 obj = new HashMapExam01();
		obj.loop();
	}
}
