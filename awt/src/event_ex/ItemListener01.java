package event_ex;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListener01 implements ItemListener{

	public static void main(String[] args) {
		Frame f = new Frame("Choice test");
		
		Panel p1 = new Panel();
		// �޺��ڽ� ���� 
		Choice combo = new Choice();
		
		combo.add("����");
		combo.add("����");
		combo.add("�Ķ�");
		combo.add("�ʷ�");
		
		//combo.addItemListener(new ItemListener01());
		
		p1.add(combo);
		
		Panel p2 = new Panel();
		// ����Ʈ ����  
		List list = new List(3,false);
		list.add("����");
		list.add("�뱸");
		list.add("����");
		list.add("�λ�");
		list.add("����");
		
		p2.add(list);
		Panel p3 = new Panel();
		// ����Ʈ ���� (���� ���� ���� )
		List list2 = new List(5,true);
		list2.add("����");
		list2.add("�뱸");
		list2.add("����");
		list2.add("�λ�");
		list2.add("����");
		
		//list.addItemListener(new ItemListener01());
		
		String []listDatas = list2.getItems();
		for(int i=0; i<listDatas.length; i++){
			System.out.println(listDatas[i]);
		}
		list2.addItemListener(new ItemListener01());
		
		p3.add(list2);         
		f.add("North",p1);
		f.add("Center",p2);
		f.add("South",p3);
		f.setSize(200,210);
		f.setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		List combo = (List)e.getSource();
		if (combo.isMultipleMode()) {
			int selectedIndexes[] = combo.getSelectedIndexes();
			for(int idx : selectedIndexes) {
				System.out.println("idx : " + idx);
			}
		}
		
		System.out.print("combo.getSelectedIndex():"+combo.getSelectedIndex());
		System.out.println(" combo.getSelectedIndex():"+combo.getSelectedItem());
	}
}
