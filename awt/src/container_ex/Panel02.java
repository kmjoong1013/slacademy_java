package container_ex;

import java.awt.Button;
import java.awt.Panel;

public class Panel02 extends Panel{

	private Button button1, button2, button3;
	
	public Panel02() {
		button1 = new Button("ok");
		button2 = new Button("open");
		button3 = new Button("close");
		
		add(button1);
		add(button2);
		add(button3);
		setSize(500, 500);
	}
}
