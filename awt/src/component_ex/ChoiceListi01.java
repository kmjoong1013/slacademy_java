package component_ex;

import java.awt.*;

public class ChoiceListi01 {

	public static void main(String[] args) {
		Frame frame = new Frame("Choice test");
		
		Panel p1 = new Panel();
		// 콤보박스 생성 
		Choice combo = new Choice();
		
		combo.add("검정");
		combo.add("빨강");
		combo.add("파랑");
		combo.add("초록");
		
		p1.add(combo);
///////////////////////////////////
		Panel p2 = new Panel();
		// 리스트 생성  
		List list = new List(3,true);
		list.add("서울");
		list.add("대구");
		list.add("대전");
		list.add("부산");
		list.add("제주");
		p2.add(list);     
		
		frame.add("Center",p2);
		frame.add("North",p1);
		frame.setSize(200, 210);
		frame.setVisible(true);
		
		list.select(2);
		list.select(1);
		//System.out.println(combo.getItemCount());
		//System.out.println(combo.getSelectedItem());
		//System.out.println(combo.getSelectedIndex());
		/*String itemList[] = list.getItems();
		  for(String item : itemList) {
		  System.out.println(item);
		 *}
		 */
		//System.out.println(list.getSelectedIndex());
		String itemList[] = list.getSelectedItems();
		for(String item : itemList) {
			System.out.println(item);
		}
	}
}
