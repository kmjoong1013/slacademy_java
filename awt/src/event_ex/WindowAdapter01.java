package event_ex;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter01 extends WindowAdapter{

	private Frame frame;
	
	public WindowAdapter01(Frame frame) {
		this.frame = frame;
	}
	@Override
	public void windowClosing(WindowEvent e) {
		frame.dispose();
	}
}
