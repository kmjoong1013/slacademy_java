package container_ex;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrame01 extends JFrame{
	private static final long serialVersionUID = 1L;
	public JFrame01() {
		super("JFrame test");
	}
	
	public static void main(String[] args) {
		JFrame01 win = new JFrame01();
		win.getContentPane().setBackground(Color.pink);
		//win.add(new JButton("my btn"));
		
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(200,200);// win.pack() 프레임을 적절한 크기로 만드는 메서드
		win.setVisible(true);    
	}
}
