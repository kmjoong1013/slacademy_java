package component_ex;

import java.awt.*;

public class ChoiceListi01 {

	public static void main(String[] args) {
		Frame frame = new Frame("Choice test");
		
		Panel p1 = new Panel();
		// �޺��ڽ� ���� 
		Choice combo = new Choice();
		
		combo.add("����");
		combo.add("����");
		combo.add("�Ķ�");
		combo.add("�ʷ�");
		
		p1.add(combo);
///////////////////////////////////
		Panel p2 = new Panel();
		// ����Ʈ ����  
		List list = new List(3,true);
		list.add("����");
		list.add("�뱸");
		list.add("����");
		list.add("�λ�");
		list.add("����");
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
