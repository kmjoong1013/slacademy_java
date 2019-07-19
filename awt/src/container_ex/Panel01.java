package container_ex;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel01 {

	public static void main(String[] args) {
		Frame frame = new Frame("PanelÅ×½ºÆ®");
		Panel panel = new Panel();
		
		frame.setSize(200,200);
		panel.setSize(100,100);
		
		frame.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
