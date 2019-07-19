package container_ex;

import java.awt.Frame;
import java.awt.Window;

public class Window01 {

	public static void main(String[] args) {
		Window win = new Window(new Frame());
		
		win.setBounds(100, 100, 200, 200);
		win.setVisible(true);
	}
}
