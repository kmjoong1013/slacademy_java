package list_ex;

import java.util.List;
import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Goods("A-100","�������س����","����",100000,3));
		list.add(new Goods("B-100","�����س����","�Ｚ",90000,7));
		list.add(new Goods("C-100","�߰ſ������","���",80000,10));
		
		for (int i = 0; i < list.size(); i++) {
			Goods goods = (Goods)list.get(i);//������ Goods�� ������ Goods�� ����
			System.out.println("----------------------------------------");
			goods.prnInfo1();
			goods.prnInfo2();
		}
	}
}
