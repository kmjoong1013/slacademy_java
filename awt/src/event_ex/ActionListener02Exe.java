package event_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;

public class ActionListener02Exe {

	public Button myButton;
	public TextArea txtArea;
	
	public ActionListener02Exe() {
		Frame frame = new Frame();
		frame.setLayout(new BorderLayout());
		// Component ��ü ����
		myButton = new Button("�����ּ���");
		txtArea = new TextArea();
		
		myButton.addActionListener(new ActionListener02(txtArea));
		
		frame.add(myButton, BorderLayout.NORTH);
		frame.add(txtArea, BorderLayout.CENTER);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		ActionListener02Exe obj = new ActionListener02Exe();
	}
}
