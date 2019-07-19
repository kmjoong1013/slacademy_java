package layout_ex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;

public class NullLayout01 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("NullLayout테스트");
		frame.setLayout(null);
		
		Button btn1 = new Button("버튼1");
		btn1.setBounds(180, 30, 70, 50);
		frame.add(btn1);
		
		TextArea txt = new TextArea("내가 원하는 위치와 크기로 컴포넌트 배치");
		txt.setBounds(50, 100, 270, 150);
		frame.add(txt);
		
		frame.setSize(350,300);
		frame.setVisible(true);
	}
}
