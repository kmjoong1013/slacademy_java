package layout_ex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;

public class NullLayout01 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("NullLayout�׽�Ʈ");
		frame.setLayout(null);
		
		Button btn1 = new Button("��ư1");
		btn1.setBounds(180, 30, 70, 50);
		frame.add(btn1);
		
		TextArea txt = new TextArea("���� ���ϴ� ��ġ�� ũ��� ������Ʈ ��ġ");
		txt.setBounds(50, 100, 270, 150);
		frame.add(txt);
		
		frame.setSize(350,300);
		frame.setVisible(true);
	}
}
