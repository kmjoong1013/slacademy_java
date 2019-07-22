package event_ex;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListener01 implements WindowListener{

	public WindowListener01(String str) {
		Frame frame = new Frame(str);
//		addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent
//				e){ System.out.println("윈도우가 종료"); dispose(); } });
		frame.addWindowListener(this);
		frame.setSize(300,250);
		frame.setVisible(true);
		}
	public static void main(String[] args) {
		WindowListener01 win = new WindowListener01("win x");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}
}
