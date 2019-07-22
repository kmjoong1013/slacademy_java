package event_ex;

import java.awt.Frame;

public class WindowAdapter01exe {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.addWindowListener(new WindowAdapter01(frame));
		
		frame.setSize(300,400);
		frame.setVisible(true);
	}
}
