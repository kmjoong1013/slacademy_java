package event_ex;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener02 implements ActionListener{
	private TextArea txtArea = null;
	
	public ActionListener02(TextArea txtArea) {
		this.txtArea = txtArea;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		txtArea.setText( txtArea.getText() + "버튼이 눌렸어요\n");
	}
}
