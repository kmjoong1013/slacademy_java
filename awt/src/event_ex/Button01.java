package event_ex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button01 implements ActionListener{

	public static void main(String[] args) {
		Frame f = new Frame("Button 테스트1");
		
		FlowLayout flayout = new FlowLayout();
		f.setLayout(flayout);
		
		Button bt1 = new Button("button1");
		bt1.addActionListener(new Button01());
		
		Button bt2 = new Button("button2");
		bt1.setSize(50,20);
		f.add(bt1);
		f.add(bt2);
		f.setBounds(10, 10, 300, 300);
		f.setVisible(true);
		System.out.println("테스트");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 발생");
		
	}
}
