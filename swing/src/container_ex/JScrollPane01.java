package container_ex;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPane01 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public JScrollPane01() {
		super("JFrame test");
	}
	
	public static void main(String[] args) {
		JScrollPane01 win = new JScrollPane01();
		
		JTextArea txtArea = new JTextArea(28,38);
		
		JScrollPane scroll = new JScrollPane(txtArea);
		scroll.setSize(200,200);
		
		Container container = win.getContentPane();
		container.add(scroll);
		
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(230,230); // win.pack() 프레임을 적절한 크기로 만드는 메서드
		win.setVisible(true);  
	}
}
