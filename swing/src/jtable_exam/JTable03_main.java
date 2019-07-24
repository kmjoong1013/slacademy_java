package jtable_exam;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTable03_main extends JFrame {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		JTable03_main win = new JTable03_main();
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add(new JTable03_listPanel(), "ȸ������Ʈ");
		tabbedPane.add(new JTable03_insPanel(), "ȸ�������Է�");
		Container container = win.getContentPane();		
		container.add(tabbedPane);		
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(540,400);
		win.setVisible(true);
	}
 
}
