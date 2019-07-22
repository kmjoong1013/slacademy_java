package event_ex;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextListener01 implements TextListener{

	private TextArea txtArea = null;
	
	public TextListener01(TextArea txtArea) {
		this.txtArea = txtArea;
	}
	
	public static void main(String[] args) {
		//������ ����
		Frame f = new Frame("�ؽ�Ʈ�ʵ� ����  ����");
		
		// �ؽ�Ʈ �ʵ� ���� 
		TextField txt1 = new TextField("�ʱ� �޼���", 10 );// �Է�ũ��� layout�� ���� �ڵ� ����
		
		TextField txt2 = new TextField();
		
		txt2.setEchoChar('*');
		
		// �ؽ�Ʈ ���� ���� 
		TextArea text = new TextArea();
		
		txt1.addTextListener(new TextListener01(text));
		
		f.add("North",txt1);
		f.add("Center",text);
		f.add("South",txt2);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		TextField txt = (TextField)e.getSource();
		txtArea.setText(txt.getText());
	}
}
