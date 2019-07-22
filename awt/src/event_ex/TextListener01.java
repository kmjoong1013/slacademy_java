package event_ex;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextListener01 implements TextListener{

	private TextArea txtArea = null;
	
	public TextListener01(TextArea txtArea) {
		this.txtArea = txtArea;
	}
	
	public static void main(String[] args) {
		//프레임 생성
		Frame f = new Frame("텍스트필드 영역  예제");
		
		// 텍스트 필드 생성 
		TextField txt1 = new TextField("초기 메세지", 10 );// 입력크기는 layout에 따라 자동 조절
		
		TextField txt2 = new TextField();
		
		txt2.setEchoChar('*');
		
		// 텍스트 영역 생성 
		TextArea text = new TextArea();
		
		txt1.addTextListener(new TextListener01(text));
		
		f.add("North",txt1);
		f.add("Center",text);
		f.add("South",txt2);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		TextField txt = (TextField)e.getSource();
		txtArea.setText(txt.getText());
	}
}
