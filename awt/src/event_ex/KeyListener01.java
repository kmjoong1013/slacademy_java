package event_ex;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListener01 implements KeyListener{

	public static void main(String[] args) {
		// ������ ����
		Frame f = new Frame("�ؽ�Ʈ�ʵ� ����  ����");
		
		// �ؽ�Ʈ �ʵ� ���� 
		TextField txt1 = new TextField("�ʱ� �޼���", 10 );// �Է�ũ��� layout�� ���� �ڵ� ���� 
		
		txt1.addKeyListener(new KeyListener01());
		
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
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
		//getModifiers() shift ctrl alt Ű�� �������� Ȯ��
		if(e.getModifiers() == KeyEvent.SHIFT_MASK) {
			System.out.println("shift mask");
		}
		char ch = e.getKeyChar();//
		
		TextField txt = (TextField)e.getSource();
		if(ch == KeyEvent.VK_ENTER) {
			txt.setText("");
			System.out.println("Enter key �� �������� ó��");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased");
	}
}
