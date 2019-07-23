package event_ex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventAnony01 {
	public WindowEventAnony01(String str) {
		Frame frame = new Frame(str);
		
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		frame.setSize(300, 250);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		 WindowEventAnony01 win = new  WindowEventAnony01("win´Ý±â¹öÆ°");
	}
}
