package container_ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPane01 extends JFrame {
	public final static long serialVersionUID = 1L;
	JButton btn1, btn2, btn3;
	JTabbedPane jtabPane;
	
	public JTabbedPane01(){
		super("JTabbedPane Å×½ºÆ®");
		
		btn1=new JButton("»çÁø1");
		btn2=new JButton("»çÁø2");
		btn3=new JButton("»çÁø3");
		
		jtabPane=new JTabbedPane();
		
		jtabPane.addTab("ÅÇ1",btn1);
		jtabPane.addTab("ÅÇ2", btn2);
		jtabPane.addTab("ÅÇ3",btn3);
		
		add(jtabPane);
		setBounds(300,300,300,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		JTabbedPane01 win = new JTabbedPane01();
		win.setVisible(true);
	}
}
