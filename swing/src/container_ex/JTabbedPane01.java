package container_ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPane01 extends JFrame {
	public final static long serialVersionUID = 1L;
	JButton btn1, btn2, btn3;
	JTabbedPane jtabPane;
	
	public JTabbedPane01(){
		super("JTabbedPane �׽�Ʈ");
		
		btn1=new JButton("����1");
		btn2=new JButton("����2");
		btn3=new JButton("����3");
		
		jtabPane=new JTabbedPane();
		
		jtabPane.addTab("��1",btn1);
		jtabPane.addTab("��2", btn2);
		jtabPane.addTab("��3",btn3);
		
		add(jtabPane);
		setBounds(300,300,300,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		JTabbedPane01 win = new JTabbedPane01();
		win.setVisible(true);
	}
}
