package component_ex;

import java.awt.*;

public class Button01 {

	public static void main(String[] args) {
		Frame f = new Frame("Button Å×½ºÆ® 1");
		
		FlowLayout flayout = new FlowLayout();
		f.setLayout(flayout);
		
		Button bt1 = new Button("button1");
		Button bt2 = new Button("button2");
		bt1.setSize(50,20);
		f.add(bt1);
		f.add(bt2);
		f.setBounds(10,10,300,300);
		f.setVisible(true);
	}
}
