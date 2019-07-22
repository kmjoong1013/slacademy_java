package event_ex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button02 implements ActionListener{

	public static void main(String[] args) {
		Frame f = new Frame("Button 테스트1");
		
		FlowLayout flayout = new FlowLayout();
		f.setLayout(flayout);
		
		Button bt1 = new Button("button1");
		Button02 eventObj = new Button02();
		bt1.addActionListener(new Button02());
		
		Button bt2 = new Button("button2");
		bt2.addActionListener(eventObj);
		
		bt1.setSize(50,20);
		f.add(bt1);
		f.add(bt2);
		f.setBounds(10, 10, 300, 300);
		f.setVisible(true);
		System.out.println("테스트");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("button1")) {
			System.out.println("button1에 대한 처리");
		}else {
			System.out.println("button2에 대한 처리");
		}
		
	}
}
