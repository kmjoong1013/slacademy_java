package list_ex;

import java.util.List;
import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Goods("A-100","미지근해냉장고","엘지",100000,3));
		list.add(new Goods("B-100","따뜻해냉장고","삼성",90000,7));
		list.add(new Goods("C-100","뜨거워냉장고","대우",80000,10));
		
		for (int i = 0; i < list.size(); i++) {
			Goods goods = (Goods)list.get(i);//위에서 Goods로 뺐으면 Goods로 써줌
			System.out.println("----------------------------------------");
			goods.prnInfo1();
			goods.prnInfo2();
		}
	}
}
