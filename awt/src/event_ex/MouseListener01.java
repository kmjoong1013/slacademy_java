package event_ex;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListener01 implements MouseListener{

	public static void main(String[] args) {
		Frame frame = new Frame("Button Å×½ºÆ® 1");
		
		FlowLayout flayout = new FlowLayout();
		frame.setLayout(flayout);
		
		Button btn1 = new Button("button1");
		Button btn2 = new Button("button2");
		
		btn1.addMouseListener(new MouseListener01());
		
		btn1.setSize(50,20);
		frame.add(btn1);
		frame.add(btn2);
		frame.setBounds(10,10,300,300);
		frame.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		System.out.println(e.getX() + ":" + e.getY());
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}
}
