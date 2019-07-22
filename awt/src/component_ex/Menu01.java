package component_ex;

import java.awt.*;

public class Menu01 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("�޴� �׽�Ʈ");
		frame.setSize(300,200);
		
		MenuBar mb = new MenuBar();
		
		//���� �޴� �����
		Menu fileMenu = new Menu("����");
		
		MenuItem newFile = new MenuItem("������");
		fileMenu.add(newFile);
		
		fileMenu.add( new MenuItem("����"));
		fileMenu.addSeparator();
		fileMenu.add( new MenuItem("�ݱ�"));
		fileMenu.add( new MenuItem("����"));
		fileMenu.add( new MenuItem("�� �̸�����"));
		fileMenu.addSeparator();
		fileMenu.add( new MenuItem("���"));
		fileMenu.addSeparator();
		fileMenu.add( new MenuItem("��"));
		
		// ���� �޴� �����
		Menu editMenu = new Menu("����");
		
		editMenu.add(new MenuItem("���"));
		editMenu.addSeparator();
		editMenu.add(new MenuItem("�߶󳻱�"));
		editMenu.add(new MenuItem("�����ϱ�"));
		editMenu.add(new MenuItem("���̱�"));   
		
		// �޴��ٿ� �޴��� �߰�.
		mb.add(fileMenu);
		mb.add(editMenu);
		
		frame.setMenuBar(mb);
		frame.setVisible(true);
	}
}
