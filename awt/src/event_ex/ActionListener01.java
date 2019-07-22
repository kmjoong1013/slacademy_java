package event_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener01 extends Frame implements ActionListener{

	public Button myButton;
	public TextArea txtArea;
	
	public ActionListener01() {
		setLayout(new BorderLayout());
		//Component ��ü ����
		myButton = new Button("�����ּ���");
		txtArea = new TextArea();
		
		myButton.addActionListener(this);
		
		add(myButton, BorderLayout.NORTH);
		add(txtArea, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		ActionListener01 obj = new ActionListener01();
		obj.setSize(300, 300);
		obj.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		txtArea.setText( txtArea.getText() + "��ư�� ���Ⱦ��\n");
	}
}
