package component_ex;

import javax.swing.JFrame;

public class JTable02exe {

	public static void main(String[] args) {
		JTable02 panel = new JTable02();
		panel.setSize(300,400);
		JFrame win = new JFrame();
		win.add(panel);
		win.setSize(540,400);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
