package component_ex;

import java.awt.*;

public class TexField {

	public static void main(String[] args) {
		// ������ ����
		Frame f = new Frame("�ؽ�Ʈ�ʵ� ���� ����");
		
		// �ؽ�Ʈ �ʵ� ���� 
		TextField txt1 = new TextField("�ʱ� �޼���", 10 );// �Է�ũ��� layout�� ���� �ڵ� ���� 
		
		txt1.select(2,4); //2~4���� ǥ�õ� ���ڿ� select
		txt1.setEditable(false);
		
		System.out.println(txt1.getText()); //��ü �� ������
		System.out.println(txt1.getSelectedText()); //selelct�� �κи� ������
		
		TextField txt2 = new TextField();
		
		txt2.setEchoChar('*');
		
		// �ؽ�Ʈ ���� ���� 
		TextArea text = new TextArea();
		
		f.add("North",txt1);
		f.add("Center",text);
		f.add("South",txt2);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
