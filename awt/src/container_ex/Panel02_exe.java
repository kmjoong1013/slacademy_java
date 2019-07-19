package container_ex;

import java.awt.FlowLayout;
import java.awt.Frame;

public class Panel02_exe {

	public static void main(String[] args) {
		
		Frame frame = new Frame("panel Å×½ºÆ®");
		frame.setLayout(new FlowLayout());
		
		Panel02 panel = new Panel02();
		
		frame.setSize(500, 500);
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
